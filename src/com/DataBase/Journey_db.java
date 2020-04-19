package com.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Model.Journey;
import com.Util.Tools;

/**
 * ר������������ĸ������ݿ����
 * 
 * @author mR
 * 
 */
public class Journey_db {
	Journey journey = null;
	Tools t = new Tools();

	/**
	 * ����������
	 * 
	 * @param con
	 * @param Jn_name
	 * @return
	 */
	public Journey search_journey(Connection con, String Jn_name) {
		String sql = "select * from journey where Jn_name=?";
//		System.out.println(Jn_name);
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, Jn_name);
//			System.out.println("333");
//			System.out.println(sql);
			ResultSet rs=pstmt.executeQuery();
			System.out.println("444");
			while (rs.next()) {
				journey.setJn_name(rs.getString("Jn_name"));
				journey.setJn_details(rs.getString("Jn_details"));
				journey.setJn_grade(rs.getString("Jn_grade"));
				journey.setJn_plan(rs.getString("Jn_plan"));
				journey.setJn_year(rs.getString("Jn_year"));
				journey.setJn_money(rs.getString("Jn_money"));
				System.out.println(rs.getString("Jn_name")+"lalal");
			}
			t.closeConn(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return journey;// ����һ��journey����
	}

	/**
	 * ��ԃ���������Ϣ
	 * 
	 * @param con
	 * @param journey
	 * @return
	 * @throws SQLException
	 */
	public ResultSet list(Connection con, Journey journey) throws SQLException {

		StringBuffer sb = new StringBuffer("select * from journey ");
		if (t.isNotEmpty(journey.getJn_name())) {
			sb.append(" and Jn_name like '%" + journey.getJn_name() + "%'");
		}
		// System.out.println(sb);
		PreparedStatement pstmt = con.prepareStatement(sb.toString().replace(
				"and", "where"));
		return pstmt.executeQuery();
	}

	/**
	 * JourneyManageFrm�������������޸ĵ����ݿ����
	 * 
	 * @param con
	 * @param journey
	 * @return
	 */
	public int updateJourney(Connection con, Journey journey) {
		int n = 0;
		// Ϊʲô������{}��ռλ����ʾ������
		String sql = "update journey set Jn_year=?,Jn_grade=?,Jn_details=?,Jn_plan=?,Jn_money=? where Jn_name=?";
		System.out.println(sql);
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, journey.getJn_year());
			pstmt.setString(2, journey.getJn_grade());
			pstmt.setString(3, journey.getJn_details());
			pstmt.setString(4, journey.getJn_plan());
			pstmt.setString(5,journey.getJn_money());
			pstmt.setString(6, journey.getJn_name());
			n = pstmt.executeUpdate();
			t.closeConn(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	/**
	 * journeyManageFrm�����ɾ������ʵ��
	 * 
	 * @param con
	 * @param jn_name
	 * @return
	 */
	public int deljourney(Connection con, String jn_name) {
		// TODO Auto-generated method stub
		int n = 0;
		try {
			String sql = "delete from journey where Jn_name=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, jn_name);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			t.closeConn(con);
		}

		return n;
	}

	/**
	 * ����������ƪ����ʵ��
	 * 
	 * @param con
	 * @param Journey_name
	 * @return
	 */
	public Journey Find_Journey(Connection con, String Journey_name) {
		Journey journey = new Journey();
		try {
			con = t.getConn();
			String sql = "select * from journey where Jn_name=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, Journey_name);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("Jn_name"));
				journey.setJn_name(rs.getString("Jn_name"));
				journey.setJn_grade(rs.getString("Jn_grade"));
				journey.setJn_plan(rs.getString("Jn_plan"));
				journey.setJn_year(rs.getString("Jn_year"));
				journey.setJn_details(rs.getString("Jn_details"));
				journey.setJn_money(rs.getString("Jn_money"));
			}
			t.closeConn(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return journey;
	}

	/**
	 * ���ֵ�ҵĳ��мƻ�������ƪ
	 * 
	 * @param con
	 * @param journey
	 * @return
	 * @throws SQLException
	 */
	public int add_Journey(Connection con, Journey journey) throws SQLException {
		int n = 0;
		// ��������
		String sql = "insert into journey_plan values(?,?,?)";
		System.out.println(sql);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(2, journey.getJn_plan());
		pstmt.setString(1, journey.getJn_name());
		pstmt.setString(3,journey.getJn_money());
		n = pstmt.executeUpdate();
		return n;
	}

	/**
	 * ����µ���������Ϣ
	 * 
	 * @param con
	 * @param journey
	 * @return
	 * @throws SQLException
	 */
	public int Add_Journey_Info(Connection con, Journey journey)
			throws SQLException {
		int n = 0;
		String sql = "insert into journey(Jn_name,Jn_year,Jn_grade,Jn_plan,Jn_details,Jn_money) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, journey.getJn_name());
		pstmt.setString(2, journey.getJn_year());
		pstmt.setString(3, journey.getJn_grade());
		pstmt.setString(4, journey.getJn_plan());
		pstmt.setString(5, journey.getJn_details());
		pstmt.setString(6,journey.getJn_money());
		n = pstmt.executeUpdate();
		return n;
	}

	/**
	 * �����ݿ�����ҵ��г����������г�
	 * @param con
	 * @return
	 * @throws SQLException 
	 */
	public ResultSet Search_Journey_Plan(Connection con) throws SQLException {
		String sql="select * from journey_plan";
		Statement stmt=con.createStatement();
		return stmt.executeQuery(sql);
	}
}
