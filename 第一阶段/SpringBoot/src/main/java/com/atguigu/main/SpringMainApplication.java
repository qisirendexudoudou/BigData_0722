package com.atguigu.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//主启动程序
@SpringBootApplication
@MapperScan(basePackages= {"com.atguigu.main.mapper"})
public class SpringMainApplication {
	
	public static void main(String[] args) {
		
		// 在运行当前类是，自动扫描当前类所在的包，及其子包，创建需要创建的对象
		SpringApplication.run(SpringMainApplication.class, args);
		
	}

}
