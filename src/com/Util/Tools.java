package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import com.Model.User;

public class Tools {

	/**
	 * 获取数据库连接
	 * 
	 * @return
	 */
	public Connection getConn() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost/shop?useUnicode=true&characterEncoding=utf-8";
		String user = "root";
		String password = "root";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("数据库连接成功");
			// Statement stmt=conn.createStatement();
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("找不到");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql错误");
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 关闭数据库连接
	 */
	public void closeConn(Connection con) {
		if (con != null) {
			try {
				con.close();
				System.out.println("关闭连接！");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("关闭异常!");
			}
		}
	}

	/**
	 * 验证登录
	 * @param userName
	 * @param password
	 * @return
	 */
	public User login(Connection conn, String userName, String password){
		User user = null;
		try {
//			Statement stmt = conn.createStatement();
			String sql = "select * from user1750423 where name=? and password=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,userName);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			
			//试一下用sqlCommand创建对象，明天来
			//现在是昨天的明天，实验失败了，要有一个数据库路径，C#差不多，但是我不知道路径
//			String sql=String.format("select * from user1750423 where name={0} and password={1}", userName,password);
			System.out.println(sql);
//			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setPassword(rs.getString("password"));
				System.out.println("登录成功！");
			}
			closeConn(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	/**
	 * 是否为空判断
	 * 
	 * @param str
	 * @return false/true
	 */
	public boolean isEmpty(String str) {
		if (str == null || "".equals(str)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * 是否不爲空判斷
	 * @param str
	 * @return
	 */
	public boolean isNotEmpty(String str)
	{
		if(str!=null && !"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 将好友添加到我的好友列表
	 * @param con
	 * @param user
	 * @return
	 */
	public int add_Friend(Connection con, User user) {
		// TODO Auto-generated method stub
		int n=0;
		String sql="insert into friend(id,name,sex,home) values(?,?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			
			System.out.println(sql);
			pstmt.setString(1,user.getId());
			pstmt.setString(2,user.getName());
			pstmt.setString(3,user.getSex());
			pstmt.setString(4,user.getHome());
			
			//返回受影响行数
			n=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
}
