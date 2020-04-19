package com.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Model.ScenePlan;


public class ScenePlan_db {
	/**
	 * 查找景点行程
	 * @return
	 * @throws SQLException 
	 */
	public ResultSet Search_ScenePlan(Connection con) throws SQLException
	{
		String sql="select distinct * from scene_plan";
		Statement stmt=con.createStatement();
		return stmt.executeQuery(sql);
	}
	
	/**
	 * 删除我的景点行程的事件处理
	 * @param con
	 * @param scene
	 * @return
	 * @throws SQLException 
	 */
	public int DelSCenePlan(Connection con,ScenePlan scene) throws SQLException
	{
//		System.out.println("名字是："+scene.getScene_name());
		String sql=" delete from scene_plan where Scene_name=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,scene.getScene_name());
		return pstmt.executeUpdate();
	}

	/**
	 * 
	 * @param con
	 * @return
	 * @throws SQLException 
	 */
	public ResultSet SearchScenePlan(Connection con) throws SQLException {
		String sql="select * from scene_plan";
		Statement stmt=con.createStatement();
		return stmt.executeQuery(sql);
	}
}
