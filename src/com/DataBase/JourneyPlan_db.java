package com.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Model.JourneyPlan;

public class JourneyPlan_db {

	/**
	 * 不写了
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public ResultSet SearchJourneyPlan(Connection con) throws SQLException
	{
		String sql="select distinct * from journey_plan";
		Statement stmt=con.createStatement();
		return stmt.executeQuery(sql);
	}

	/**
	 * 从我的行程删除旅行社行程
	 * @param con
	 * @param journey
	 * @return
	 * @throws SQLException
	 */
	public int DelJourneyPlan(Connection con, JourneyPlan journey) throws SQLException {
		String sql=" delete from journey_plan where journey_name=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,journey.getJourney_name());
		return pstmt.executeUpdate();
	}
}
