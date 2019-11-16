package com.atguigu.java;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //必须写否则通过反射获取不到该注解
public @interface MyAnn {
	int age() default 5;
	String className() default "aaa";
}
