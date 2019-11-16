package com.atguigu;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.ArrayList;
import java.util.Properties;

public class AsyncProducer {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("bootstrap.servers",
                "hadoop102:9092,hadoop103:9092,hadoop104:9092");
        prop.setProperty("acks", "all");
        prop.setProperty("retries", "5");
        prop.setProperty("batch.size", "16384");
        prop.setProperty("linger.ms", "10");
        prop.setProperty("enable.idempotence", "true");

        prop.setProperty("prefix", "XXXXXXXXXX");

        ArrayList<String> interceptors = new ArrayList<String>();
        interceptors.add("TimeInterceptor");
        interceptors.add("CountInterceptor");

        prop.put(ProducerConfig.INTERCEPTOR_CLASSES_CONFIG, interceptors);

        prop.setProperty("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        prop.setProperty("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");

        //new一个Producer
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(prop);

        for (int i = 0; i < 5; i++) {
            //用Producer发信息
            producer.send(new ProducerRecord<String, String>("first", "Hello World" + i));

        }

        //关闭Producer
        producer.close();

    }
}
