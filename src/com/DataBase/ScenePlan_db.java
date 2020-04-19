package com.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Model.ScenePlan;


public class ScenePlan_db {
	/**
	 * ���Ҿ����г�
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
	 * ɾ���ҵľ����г̵��¼�����
	 * @param con
	 * @param scene
	 * @return
	 * @throws SQLException 
	 */
	public int DelSCenePlan(Connection con,ScenePlan scene) throws SQLException
	{
//		System.out.println("�����ǣ�"+scene.getScene_name());
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
