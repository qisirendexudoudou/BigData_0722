package com.atguigu.consumer;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;

import java.util.Collections;
import java.util.Map;
import java.util.Properties;

/**
 * 自动提交Offset的Kafka消费者API
 * @Author lzc
 * @Date 2019/11/1 10:41
 */
public class KafkaConsumerManual {

    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("bootstrap.servers", "hadoop102:9092");
        properties.setProperty("group.id", "test");
        properties.setProperty("enable.auto.commit", "false");
        properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        //new一个consumer
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);

        //consumer要订阅到一个KafkaTopic
        consumer.subscribe(Collections.singleton("first"));

        while (true) {

            //拉数据
            ConsumerRecords<String, String> poll = consumer.poll(1000);

            //数据消费不重复,但可能不完全消费
//            consumer.commitSync();

            //消费数据
            for (ConsumerRecord<String, String> record : poll) {
//                System.out.println(record.topic());
//                System.out.println(record.partition());
                System.out.println(new String(record.value()));
            }

            //数据可以确保被消费至少一次,但是有可能出现重复消费
            consumer.commitAsync(new OffsetCommitCallback(){

                //提交完成调用该回调函数
                @Override
                public void onComplete(Map<TopicPartition, OffsetAndMetadata> offsets, Exception exception) {
                    if (exception == null) {
                        System.out.println("提交成功");
                    }
                }
            });
        }


        //关闭consumer
//        consumer.close();
    }
}
