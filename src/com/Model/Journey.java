package com.Model;

/**
 * 旅行社的实体
 * @author mR
 *
 */
public class Journey {
	public Journey() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String Jn_name;
	private String Jn_year;
	
	public Journey(String jn_name, String jn_year, String jn_grade,
			String jn_plan, String jn_details, String jn_money) {
		super();
		Jn_name = jn_name;
		Jn_year = jn_year;
		Jn_grade = jn_grade;
		Jn_plan = jn_plan;
		Jn_details = jn_details;
		Jn_money = jn_money;
	}
	private String Jn_grade;
	private String Jn_plan;
	private String Jn_details;
	private String Jn_money;
	public String getJn_name() {
		return Jn_name;
	}
	public void setJn_name(String jn_name) {
		Jn_name = jn_name;
	}
	public String getJn_year() {
		return Jn_year;
	}
	public void setJn_year(String jn_year) {
		Jn_year = jn_year;
	}
	public String getJn_grade() {
		return Jn_grade;
	}
	public void setJn_grade(String jn_grade) {
		Jn_grade = jn_grade;
	}
	public String getJn_plan() {
		return Jn_plan;
	}
	public void setJn_plan(String jn_plan) {
		Jn_plan = jn_plan;
	}
	public String getJn_details() {
		return Jn_details;
	}
	public void setJn_details(String jn_details) {
		Jn_details = jn_details;
	}
	public String getJn_money() {
		return Jn_money;
	}
	public void setJn_money(String jn_money) {
		Jn_money = jn_money;
	}
}
