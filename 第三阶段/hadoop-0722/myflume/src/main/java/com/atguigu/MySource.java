package com.atguigu;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.EventDeliveryException;
import org.apache.flume.PollableSource;
import org.apache.flume.channel.ChannelProcessor;
import org.apache.flume.conf.Configurable;
import org.apache.flume.event.SimpleEvent;
import org.apache.flume.source.AbstractSource;

import java.util.HashMap;

public class MySource extends AbstractSource implements Configurable, PollableSource {

    private String prefix;
    private long delay;
    //拉取数据，处理数据
    public Status process() throws EventDeliveryException {
        Status status = null;
        try {

            Event e = getSomeData();

            ChannelProcessor processor = getChannelProcessor();
            processor.processEvent(e);

            Thread.sleep(delay);

            status = Status.READY;
        } catch (Throwable t) {

            status = Status.BACKOFF;

            if (t instanceof Error) {
                throw (Error) t;
            }
        }
        return status;
    }

    private Event getSomeData() {
        //假设a就是我们此次获取的数据
        String a = Integer.toString((int) (Math.random() * 1000));

        SimpleEvent event = new SimpleEvent();
        event.setBody((prefix + a).getBytes());
        event.setHeaders(new HashMap<String, String>());
        return event;
    }

    //等待增加时间
    public long getBackOffSleepIncrement() {
        return 1000;
    }
    //等待最大时间
    public long getMaxBackOffSleepInterval() {
        return 10000;
    }
    //获取配置信息
    public void configure(Context context) {
        prefix = context.getString("prefix", "DefaultPrefix-");
    }
}
