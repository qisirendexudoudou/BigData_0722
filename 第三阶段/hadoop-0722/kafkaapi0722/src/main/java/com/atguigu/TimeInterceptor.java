package com.atguigu;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Map;

/**
 * 在Record的Value之前加时间戳
 */
public class TimeInterceptor implements ProducerInterceptor<String, String> {

    private String prefix;

    /**
     * 修改record，在Value前加时间戳
     * @param record
     * @return
     */
    @Override
    public ProducerRecord<String, String> onSend(ProducerRecord<String, String> record) {
        return new ProducerRecord<String, String>(
                record.topic(),
                record.partition(),
                record.timestamp(),
                record.key(),
                prefix + record.value(),
                record.headers()
        );
    }

    /**
     * 收到服务器ACK后调用该方法
     * @param metadata
     * @param exception
     */
    @Override
    public void onAcknowledgement(RecordMetadata metadata, Exception exception) {

    }

    /**
     * Producer关闭时执行该方法
     */
    @Override
    public void close() {

    }

    /**
     * 配置拦截器
     * @param configs
     */
    @Override
    public void configure(Map<String, ?> configs) {
        prefix = (String) configs.get("prefix");

        if (prefix == null) {
            prefix = "Default prefix:";
        }
    }
}
