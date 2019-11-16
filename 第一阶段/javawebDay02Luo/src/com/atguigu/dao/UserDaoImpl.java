package com.atguigu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.atguigu.jdbc.utils.JDBCTools;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUser(String username, String password) throws Exception {
		
		User user=null;
		
		//获取连接
		Connection conn = JDBCTools.getConnection();
		
		//SQL语句
		String sql = "select * from tbl_user where username=? and password=?";
		
		//获取PreparedStatement对象
		PreparedStatement statement = conn.prepareStatement(sql);
		
		//set方法设置占位符参数
		statement.setString(1, username);
		statement.setString(2, password);
		
		//执行SQL,返回resultset对象
		ResultSet resultSet = statement.executeQuery();
		
		//遍历
		while(resultSet.next()) {
			user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
		}
		
		//释放资源
		JDBCTools.close(resultSet, statement, conn);
		
		return user;
		
		
	}
}
