package com.atguigu.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class AsyncProducer {
    public static void main(String[] args) {

        //设置参数
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers",
                "hadoop101:9092,hadoop102:9092,hadoop103:9092");
        properties.setProperty("acks", "all");
        properties.setProperty("retries", "5");
        properties.setProperty("batch.size", "16384");
        properties.setProperty("linger.ms", "10");
        properties.setProperty("enable.idempotence", "true");

        properties.setProperty("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        properties.setProperty("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        //new Producer对象
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(properties);
        for (int i = 0; i <10000 ; i++) {
        //生产消息
        kafkaProducer.send(new ProducerRecord<String, String>("frist", "xiaoxu"+i));
        }
        //关闭producer
        kafkaProducer.close();
    }
}
