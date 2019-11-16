package com.atguigu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.atguigu.entity.Employee;
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

	@Override
	public boolean validUsernameExist(String username) throws Exception {
		
		Connection conn = JDBCUtils.getConn();
		
		String sql="select * from tbl_user where username=? ";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, username);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			
			JDBCUtils.close(rs, ps, conn);
			
			return true;

		}
		
		JDBCUtils.close(rs, ps, conn);
		
		return false;
	}

	@Override
	public List<Employee> getAllEmps() throws Exception {
		
		Connection conn = JDBCUtils.getConn();
		
		String sql="select id,last_name lastName,email,gender from tbl_employee";
		
		QueryRunner queryRunner = new QueryRunner();
		
		List<Employee> emps = queryRunner.query(conn, sql, new BeanListHandler<>(Employee.class));
		
		JDBCUtils.close(null, null, conn);
		
		return emps;
	}

}
