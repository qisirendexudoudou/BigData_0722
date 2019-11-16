package com.atguigu.interceptor;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Map;

public class CountInterceptor implements ProducerInterceptor<String,String> {

    private int success = 0;
    private int fail = 0;

    @Override
    public ProducerRecord<String, String> onSend(ProducerRecord<String, String> record) {
        return record;
    }

    @Override
    public void onAcknowledgement(RecordMetadata metadata, Exception exception) {
        if (exception == null) {
            success++;
        } else {
            fail++;
        }
    }

    @Override
    public void close() {
        System.out.println("成功了" + success + "条");
        System.out.println("失败了" + fail + "条");
    }

    @Override
    public void configure(Map<String, ?> configs) {

    }
}
