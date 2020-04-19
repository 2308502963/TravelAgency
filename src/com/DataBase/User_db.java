package com.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Model.User;
import com.Util.Tools;

/** 
 * 实现对用户表的增删改查功能
 * @author mR
 *
 */
public class User_db {
	Tools t=new Tools();
	/**
	 * 查找用户
	 * @return
	 */
	public User find_User(Connection con,String username)
	{
		User user=null;
		String sql = "select * from user1750423 where name=?";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,username);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				user=new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setHome(rs.getString("home"));
			}
			t.closeConn(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	/**
	 * 查询用户信息，初始化table用的
	 * @param con
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public ResultSet list(Connection con, User user) throws SQLException {
		StringBuffer sb = new StringBuffer("select * from user1750423 ");
		if (t.isNotEmpty(user.getName())) {
			sb.append(" and name like '%" + user.getName() + "%'");
		}
		if(t.isNotEmpty(user.getHome())){
			sb.append(" and home like '%" + user.getHome() + "%'");
		}
		sb.append(" order by id");
		PreparedStatement pstmt = con.prepareStatement(sb.toString().replace("and", "where"));
		System.out.println(sb);
		return pstmt.executeQuery();
	}

	/**
	 * 用户管理页面实现用户的删除操作
	 * @param con
	 * @param user_id
	 * @return
	 */
	public int Del_User(Connection con, String user_id) {
		// TODO Auto-generated method stub
		int n=0;
		try{
			String sql="delete from user1750423 where id=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,user_id);
			n=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			t.closeConn(con);
		}
		
		return n;
	}

	/**
	 * 用户管理界面修改用户信息的功能的实现
	 * @param con
	 * @param user
	 * @return
	 */
	public int Update_User(Connection con, User user) {
		int n=0;
		//为什么这里用{}来占位会提示错误呢
		String sql="update user1750423 set name=?,sex=?,home=? where id=?";
		System.out.println(sql);
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,user.getName());
			pstmt.setString(2,user.getSex());
			pstmt.setString(3,user.getHome());
			pstmt.setString(4,user.getId());
			n=pstmt.executeUpdate();
			t.closeConn(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	/**
	 * 添加新的用户信息到数据库技术实现
	 * @param con
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public int Add_UserInfo(Connection con, User user) throws SQLException {
		int n=0;
		String sql="insert into user1750423(id,name,sex,home,password) values(?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,user.getId());
		pstmt.setString(2,user.getName());
		pstmt.setString(3, user.getSex());
		pstmt.setString(4,user.getHome());
		pstmt.setString(5,user.getPassword());
		n=pstmt.executeUpdate();
		return n;
	}
}
