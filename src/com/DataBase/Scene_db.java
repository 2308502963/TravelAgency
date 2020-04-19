package com.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Model.Scene;
import com.Util.Tools;

/**
 * 处理景点的数据库操作类
 * 
 * @author mR
 */
public class Scene_db {

	Tools t = new Tools();
	Scene scene = new Scene();

	/**
	 * 查找景点
	 * 
	 * @param con
	 * @param Scene_name
	 * @return
	 * @throws SQLException
	 */
	public Scene Search_Scene(Connection con, String Scene_name)
			throws SQLException {
		String sql = "select * from scene where Scene_name=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, Scene_name);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			scene.setScene_id(rs.getString("Scene_id"));
			scene.setScene_details(rs.getString("Scene_details"));
			scene.setScene_grade(rs.getString("Scene_grade"));
			scene.setScene_local(rs.getString("Scene_local"));
			scene.setScene_name(rs.getString("Scene_name"));
			scene.setScene_price(rs.getString("Scene_price"));
		}
		System.out.println(scene.getScene_price());
		return scene;
	}

	/**
	 * 添加景点至我的行程篇功能实现
	 * 
	 * @param con
	 * @param Scene_name
	 * @return
	 * @throws SQLException
	 */
	public int add_Scene(Connection con, String scene_id, String scene_name)
			throws SQLException {
		// TODO Auto-generated method stub
		int n = 0;
		// String sql =
		// "update scene_plan set Scene_plan=true where Scene_id=?";
		String sql = "insert into scene_plan(Scene_id,Scene_name,Scene_plan) values(?,?,?)";

		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, scene_id);
		pstmt.setString(2, scene_name);
		pstmt.setString(3, "true");
		n = pstmt.executeUpdate();
		return n;
	}

	public ResultSet list(Connection con, Scene scene) throws SQLException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("select * from scene ");
		if (t.isNotEmpty(scene.getScene_name())) {
			sb.append(" and Scene_name like '%" + scene.getScene_name() + "%'");
		}
		sb.append(" order by Scene_id asc");
		// System.out.println(sb);
		PreparedStatement pstmt = con.prepareStatement(sb.toString().replace(
				"and", "where"));
		return pstmt.executeQuery();
	}

	/**
	 * 修改操作的实现
	 * 
	 * @param con
	 * @param scene
	 * @return
	 */
	public int Update_Scene(Connection con, Scene scene) {
		int n = 0;
		String sql = "update scene set Scene_price=?,Scene_grade=?,Scene_details=?,Scene_local=?,Scene_name=? where Scene_id=?";
		System.out.println(sql);
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, scene.getScene_price());
			pstmt.setString(2, scene.getScene_grade());
			pstmt.setString(3, scene.getScene_details());
			pstmt.setString(4, scene.getScene_local());
			pstmt.setString(5, scene.getScene_name());
			pstmt.setString(6, scene.getScene_id());
			n = pstmt.executeUpdate();
			t.closeConn(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	/**
	 * 删除景点
	 * 
	 * @param con
	 * @param scene_name
	 * @return
	 */
	public int Del_Scene(Connection con, String scene_id) {
		// TODO Auto-generated method stub
		int n = 0;
		try {
			String sql = "delete from scene where Scene_id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, scene_id);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			t.closeConn(con);
		}

		return n;
	}

	/**
	 * 用来添加新的景点信息的
	 * 
	 * @param con
	 * @param scene2
	 * @return
	 * @throws SQLException
	 */
	public int Add_SceneInfo(Connection con, Scene scene) throws SQLException {
		int n = 0;
		String sql = "insert into scene (Scene_id,Scene_name,Scene_price,Scene_grade,Scene_details,Scene_local) values(?,?,?,?,?,?)";
		System.out.println(scene.getScene_id());
		System.out.println(scene.getScene_local());
		System.out.println(scene.getScene_grade());
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, scene.getScene_id());
		pstmt.setString(2, scene.getScene_name());
		pstmt.setString(3, scene.getScene_price());
		pstmt.setString(4, scene.getScene_grade());
		pstmt.setString(5, scene.getScene_details());
		pstmt.setString(6, scene.getScene_local());
		n = pstmt.executeUpdate();
		return n;
	}

	/**
	 * 从数据库查找相关景点显示出来
	 * 
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public ResultSet Search_Scene_Plan(Connection con) throws SQLException {
		String sql = "select * from scene_plan,scene where scene_plan.Scene_id=scene.Scene_id";
		Statement stmt = con.createStatement();
		return stmt.executeQuery(sql);
	}

}
