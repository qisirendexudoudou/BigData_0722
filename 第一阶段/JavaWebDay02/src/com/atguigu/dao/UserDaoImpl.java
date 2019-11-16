package com.atguigu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.atguigu.entity.User;
import com.atguigu.jdbc.utils.JDBCUtils;

public class UserDaoImpl implements UserDao{

	@Override
	public User getUserByUserNameAndPassword(String username, String password) throws Exception {
		
		User user=null;
		
		Connection conn = JDBCUtils.getConn();
		
		String sql="select * from tbl_user where username=? and password=?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, username);
		
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			user=new User(rs.getInt(1), rs.getString(2), rs.getString(3));

		}
		
		JDBCUtils.close(rs, ps, conn);
		
		return user;
	}

}
