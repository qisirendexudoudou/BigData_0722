package com.atguigu.producer;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class SyncProducer {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

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

        for (int i = 0; i < 99; i++) {


        //生产消息
        Future<RecordMetadata> metadataFuture = kafkaProducer.send(
                new ProducerRecord<String, String>("second", ""), new Callback() {
                    public void onCompletion(RecordMetadata metadata, Exception exception) {
                        if (exception == null) {
                            System.out.println("已收到消息, 元数据是：" + metadata);

                        } else {
                            System.out.println("发送失败，异常是：" + exception.getMessage());
                        }
                    }
                }
        );

        System.out.println("消息发送完成！");

        //RecordMetadata metadata = metadataFuture.get();

        }

        //关闭producer
        kafkaProducer.close();
    }

}
