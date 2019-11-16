package com.atguigu.wordcount;


import org.apache.hadoop.mapreduce.Job;
import java.io.IOException;


public class WordCountDriver {

    public static void main(String[] args) throws IOException {
//        Configuration conf = new Configuration();
        Job job = Job.getInstance();
        job.setMapperClass(WordCountMapper.class);

    }




}
