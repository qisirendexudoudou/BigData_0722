package com.atguigu.mvc;

import org.springframework.stereotype.Repository;

import com.atguigu.entity.User;
@Repository
public class UserDao {

	public User getUserById() {
		System.out.println("查询了数据库....");
		User user = new User(1, "xiaoxu", "123456");
		return user;
	}
}
