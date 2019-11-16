package com.atguigu.dw.flume;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.conf.LogPrivacyUtil;
import org.apache.flume.interceptor.Interceptor;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

public class ETLInterceptor implements Interceptor {
    @Override
    public void initialize() {

    }

    /**
     * 简单etl
     * @param event
     * @return
     */
    @Override
    public Event intercept(Event event) {
        if (event == null) {
            return null;
        }
        byte[] body = event.getBody();
        String s = new String(body, Charset.forName("utf-8"));
        if (s.contains("\"en\":\"start\"")) {//启动日志
            if (LogUitl.validateStart(s)) {
                return event;
            }
        } else {//时间日志
            if (LogUitl.validateEvent(s)) {
                return event;
            }
        }
        return null;
    }

    /**
     * 返回值必须是原来的list
     * 把需要拦截的event从list中移除
     * @param events
     * @return
     */
    @Override
    public List<Event> intercept(List<Event> events) {
        Iterator<Event> iterator = events.iterator();
        while (iterator.hasNext()) {
            Event event = iterator.next();
            if (intercept(event) == null) {
                iterator.remove();
            }
        }
        return events;
    }

    @Override
    public void close() {

    }

    //创建静态内部类Builder
    public  static  class Builder implements Interceptor.Builder{

        @Override
        public Interceptor build() {
            return new ETLInterceptor();
        }

        @Override
        public void configure(Context context) {

        }
    }

}
