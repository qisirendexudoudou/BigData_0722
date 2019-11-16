package com.atguigu.consumer;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;

import java.io.*;
import java.util.*;

/**
 * 自定义存储Offset
 */
public class KafkaConsumerSave {

    //自定义Offset的缓存
    private static Map<TopicPartition, Long> offset;

    private static final String OFFSET_PATH = "d:/offset";

    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("bootstrap.servers", "hadoop102:9092");
        properties.setProperty("group.id", "test");
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("auto.commit.interval.ms", "1000");
        properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        //new一个consumer
        final KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);

        //订阅到一个话题
        consumer.subscribe(Collections.singleton("first"), new ConsumerRebalanceListener() {

            //分区再平衡之前执行
            @Override
            public void onPartitionsRevoked(Collection<TopicPartition> partitions) {

                //提交Offset
                commit();
            }

            //分区再平衡之后执行
            @Override
            public void onPartitionsAssigned(Collection<TopicPartition> partitions) {

                //从自定义存储中获取Offset
                read();

                for (TopicPartition partition : partitions) {
                    Long os = offset.get(partition);
                    if (os == null) {
                        consumer.seek(partition, 0);
                    } else {
                        consumer.seek(partition, os);
                    }
                }
            }
        });

        while (true) {
            //txn.begin()


            //从Kafka中拉取数据
            ConsumerRecords<String, String> records = consumer.poll(1000);

            TopicPartition first = new TopicPartition("first", 0);
            consumer.seek(first, 0);

            //消费数据
            for (ConsumerRecord<String, String> record : records) {
                System.out.println(record);
                //更新Offset缓存
                offset.put(new TopicPartition(
                        record.topic(), record.partition()), record.offset());
            }

            //提交Offset
            commit();

            System.out.println("提交成功！");

        }

        //consumer.close();
    }

    /**
     * 从自定义存储中获取Offset
     */
    private static void read() {
        File file = new File(OFFSET_PATH);

        //看看之前有没有Offset
        if (file.exists()) {
            ObjectInputStream inputStream = null;
            try {
                inputStream = new ObjectInputStream(new FileInputStream(file));
                offset = (Map<TopicPartition, Long>) inputStream.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


        } else {
            offset = new HashMap<TopicPartition, Long>();
        }

    }

    /**
     * 提交Offset到自定义存储
     */
    private static void commit() {
        if (offset != null) {
            File file = new File(OFFSET_PATH);
            if (file.exists()) {
                ObjectInputStream inputStream = null;
                try {
                    inputStream = new ObjectInputStream(new FileInputStream(file));
                    Map<TopicPartition, Long> oldOffset = (Map<TopicPartition, Long>)
                            inputStream.readObject();
                    oldOffset.putAll(offset);
                    offset = oldOffset;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            ObjectOutputStream outputStream = null;
            try {
                outputStream = new ObjectOutputStream(new FileOutputStream(file));
                outputStream.writeObject(offset);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
