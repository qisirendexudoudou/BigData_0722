package com.atguigu.consumer;

import com.sun.scenario.effect.Offset;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;

import java.util.Collections;
import java.util.Map;
import java.util.Properties;

public class ConsumerManual {
    public static void main(String[] args) {

        //参数配置
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "hadoop103:9092");
        properties.setProperty("group.id", "test");
        properties.setProperty("enable.auto.commit", "false");
        properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        //new Consumer对象
        KafkaConsumer kafkaConsumer = new KafkaConsumer<String,String>(properties);

        //订阅到一个topic
        kafkaConsumer.subscribe(Collections.singleton("frist"));

        while (true) {

        //拉取数据
        ConsumerRecords<String,String> poll = kafkaConsumer.poll(100);
        for (ConsumerRecord<String, String> record : poll) {
//            System.out.println(record.topic());
//            System.out.println(record.partition());
            System.out.println(record.value());
        }
//            kafkaConsumer.commitAsync(new OffsetCommitCallback() {
//                public void onComplete(Map<TopicPartition, OffsetAndMetadata> offsets, Exception exception) {
//                    if (exception == null) {
//                        System.out.println("提交成功");
//                    }
//                }
//            });
            kafkaConsumer.commitSync();
        }



        //关闭consumer
//        kafkaConsumer.close();
    }
}
