package com.atguigu.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Collections;
import java.util.Properties;

/**
 * 自动提交Offset的Kafka消费者API
 * @Author lzc
 * @Date 2019/11/1 10:41
 */
public class KafkaConsumerAuto {

    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("bootstrap.servers", "hadoop102:9092");
        properties.setProperty("group.id", "test");
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("auto.commit.interval.ms", "1000");
        properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        //new一个consumer
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);

        //consumer要订阅到一个KafkaTopic
        consumer.subscribe(Collections.singleton("first"));

        while (true) {

            //拉数据
            ConsumerRecords<String, String> poll = consumer.poll(100);

            for (ConsumerRecord<String, String> record : poll) {
                System.out.println(record.topic());
                System.out.println(record.partition());
                System.out.println(record.value());
            }
        }


        //关闭consumer
//        consumer.close();
    }
}
