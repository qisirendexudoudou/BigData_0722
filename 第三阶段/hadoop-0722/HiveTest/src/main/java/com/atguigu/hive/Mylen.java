package com.atguigu.hive;


import org.apache.hadoop.hive.ql.exec.UDF;

public class Mylen extends UDF {
    public int evaluate (String s){
        if ( s == null){
            return 0;
        }
            return s.toString().length();
    }

    public int evaluate (Number n){
        if ( n == null){
            return 0;
        }
        return n.toString().length();
    }
}
