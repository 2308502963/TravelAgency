package com.DataBase;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Model.JourneyPlan;
import com.Model.ScenePlan;
import com.Util.Tools;

/**
 * 银行卡扣钱操作
 * 
 * @author mR
 * 
 */
public class Credit_db {
	Tools t = new Tools();

	/**
	 * 查询银行卡余额
	 * 
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public ResultSet FindMoney(Connection con) throws SQLException {
		String sql = "select * from credit";
		Statement stmt = con.createStatement();

		return stmt.executeQuery(sql);

	}

	/**
	 * 实现银行卡的扣钱功能
	 * 
	 * @param con
	 * @param jn_money
	 * @return
	 * @throws SQLException
	 */
	public int KouQian(Connection con, String money) throws SQLException {
		int n = 0;
		String sql = "update credit set money=(money-?) where ID='175042327'";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, money);
		return pstmt.executeUpdate();
	}

	/**
	 * 实现退款功能
	 * 
	 * @param con
	 * @param journey_money
	 * @return
	 * @throws SQLException
	 */
	public int TuiQian(Connection con, JourneyPlan journeyPlan)
			throws SQLException {
		int n = 0;
		String sql = "update credit set money=(money+?) where ID='175042327'";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, journeyPlan.getJourney_money());
		n = pstmt.executeUpdate();
		return n;

	}

	/**
	 * 实现退款功能
	 * @param con
	 * @param scenePlan
	 * @return
	 * @throws SQLException 
	 */
	public int TuiQian(Connection con, ScenePlan scenePlan) throws SQLException {
		String sql="update credit set money=(money+?) where ID='175042327'";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,scenePlan.getScene_money());
		int n=pstmt.executeUpdate();
		return n;
	}
}
