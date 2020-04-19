package com.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Model.friend;
import com.Util.Tools;

/**
 * 我的好友的管理
 * 
 * @author mR
 * 
 */
public class Friend_db {

	/**
	 * 查找出来我的好友
	 * 
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public static ResultSet SearchMyFriend(Connection con) throws SQLException {
		Tools t = new Tools();
		String sql = "select distinct * from friend";

		Statement stmt = con.createStatement();

		return stmt.executeQuery(sql);
	}

	/**
	 * 删除好友功能实现
	 * @param con
	 * @param f
	 * @return
	 * @throws SQLException
	 */
	public int Delfriend(Connection con, friend f) throws SQLException {
		String sql=" delete from friend where id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,f.getId());
		return pstmt.executeUpdate();
	}

}
