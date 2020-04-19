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
	 * ��ȡ���ݿ�����
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
			System.out.println("���ݿ����ӳɹ�");
			// Statement stmt=conn.createStatement();
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�Ҳ���");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql����");
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * �ر����ݿ�����
	 */
	public void closeConn(Connection con) {
		if (con != null) {
			try {
				con.close();
				System.out.println("�ر����ӣ�");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("�ر��쳣!");
			}
		}
	}

	/**
	 * ��֤��¼
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
			
			//��һ����sqlCommand��������������
			//��������������죬ʵ��ʧ���ˣ�Ҫ��һ�����ݿ�·����C#��࣬�����Ҳ�֪��·��
//			String sql=String.format("select * from user1750423 where name={0} and password={1}", userName,password);
			System.out.println(sql);
//			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setName(rs.getString("name"));
				user.setSex(rs.getString("sex"));
				user.setPassword(rs.getString("password"));
				System.out.println("��¼�ɹ���");
			}
			closeConn(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	/**
	 * �Ƿ�Ϊ���ж�
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
	 * �Ƿ񲻠����Д�
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
	 * ��������ӵ��ҵĺ����б�
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
			
			//������Ӱ������
			n=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
}
