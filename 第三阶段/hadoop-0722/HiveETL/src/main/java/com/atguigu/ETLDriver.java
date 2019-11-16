package com.atguigu;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class ETLDriver {
    private Configuration conf;

    public int run(String[] args) throws Exception {
        Job job = Job.getInstance(conf);

        job.setJarByClass(ETLDriver.class);

        job.setMapperClass(ETLMapper.class);
        job.setNumReduceTasks(0);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(NullWritable.class);

        FileInputFormat.setInputPaths(job, new Path("G:\\0722\\练习题\\第三阶段\\tt"));
        FileOutputFormat.setOutputPath(job, new Path("G:\\0722\\练习题\\第三阶段\\tt_result"));

        boolean b = job.waitForCompletion(true);

        return b ? 0 : 1;
    }

    public void setConf(Configuration conf) {
        this.conf = conf;
    }

    public Configuration getConf() {
        return conf;
    }

}
