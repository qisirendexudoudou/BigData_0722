package com.atguigu.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Collections;
import java.util.Properties;

public class ConsumerAuto {
    public static void main(String[] args) {

        //参数配置
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "hadoop103:9092");
        properties.setProperty("group.id", "test");
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("auto.commit.interval.ms", "1000");
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

        }
        //关闭consumer
//        kafkaConsumer.close();
    }
}
