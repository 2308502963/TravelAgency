package com.Model;

/**
 * 银行卡的实体类
 * @author mR
 *
 */
public class Credit {
	private String ID;//银行卡id
	private String name_holder;//银行卡持卡人
	private float money;//钱
	private String pay_pw;//支付密码
	
	
	public Credit(String iD, String name_holder, float money, String pay_pw) {
		super();
		ID = iD;
		this.name_holder = name_holder;
		this.money = money;
		this.pay_pw = pay_pw;
	}
	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName_holder() {
		return name_holder;
	}
	public void setName_holder(String name_holder) {
		this.name_holder = name_holder;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getPay_pw() {
		return pay_pw;
	}
	public void setPay_pw(String pay_pw) {
		this.pay_pw = pay_pw;
	}
}
