package com.atguigu;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;

public class AsyncProducerWithCallback {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("bootstrap.servers",
                "hadoop102:9092,hadoop103:9092,hadoop104:9092");
        prop.setProperty("acks", "all");
        prop.setProperty("retries", "5");
        prop.setProperty("batch.size", "16384");
        prop.setProperty("linger.ms", "10");
        prop.setProperty("enable.idempotence", "true");

        prop.setProperty("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        prop.setProperty("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        //new一个Producer
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(prop);

        for (int i = 0; i < 5; i++) {


            //用Producer发信息
            producer.send(new ProducerRecord<String, String>("first", "XXXXXXXXXXXX" + i),
                    new Callback() {
                        public void onCompletion(RecordMetadata metadata, Exception exception) {
                            if (exception == null) {
                                System.out.println("已收到消息, 元数据是：" + metadata);

                            } else {
                                System.out.println("发送失败，异常是：" + exception.getMessage());
                            }
                        }
                    });
            System.out.println("消息" + i + "发送完成");
        }
        //关闭Producer
        producer.close();

    }
}
