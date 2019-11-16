package com.atguigu;


import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.util.List;
import java.util.Map;

public class Custominterceptot  implements Interceptor {
    //初始化
    public void initialize() {

    }

    //处理单个事件
    public Event intercept(Event event) {

        //获取body内容
        byte[] body = event.getBody();

        //获取headers内容
        Map<String, String> headers = event.getHeaders();

        //判断第一个字母是否是字母
        if ((body[0] >= 'A' && body[0] <='Z' ) || (body[0] >= 'a' && body[0] <='z' ) ){
            headers.put("type", "al");
        }else {
            headers.put("type", "not_al");
        }

        return event;
    }

    //批量处理事件
    public List<Event> intercept(List<Event> events) {
        for (Event event : events) {
            intercept(event);
        }

        return events;
    }

    //关闭资源
    public void close() {

    }

    public static class CustomBuilder implements Builder {

        public Interceptor build() {
            return new Custominterceptot();
        }

        public void configure(Context context) {

        }
    }

}
