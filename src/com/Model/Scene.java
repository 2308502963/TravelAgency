package com.Model;

/*
 * ���ξ����ʵ��
 */
public class Scene {
	private String Scene_name;// ��������
	private String Scene_price;// ����۸�
	private String Scene_grade;// �����Ƽ��ȼ�
	private String Scene_local;// �����ʡ��
	private String Scene_details;// �������ϸ��Ϣ
	private String Scene_id;//�������
	public String getScene_name() {
		return Scene_name;
	}
	public void setScene_name(String scene_name) {
		Scene_name = scene_name;
	}
	
	public Scene(String scene_name, String scene_price, String scene_grade,
			String scene_local, String scene_details, String scene_id) {
		super();
		Scene_name = scene_name;
		Scene_price = scene_price;
		Scene_grade = scene_grade;
		Scene_local = scene_local;
		Scene_details = scene_details;
		Scene_id = scene_id;
	}
	public Scene() {
		// TODO Auto-generated constructor stub
	}
	public String getScene_price() {
		return Scene_price;
	}
	public void setScene_price(String scene_price) {
		Scene_price = scene_price;
	}
	public String getScene_grade() {
		return Scene_grade;
	}
	public void setScene_grade(String scene_grade) {
		Scene_grade = scene_grade;
	}
	public String getScene_local() {
		return Scene_local;
	}
	public void setScene_local(String scene_local) {
		Scene_local = scene_local;
	}
	public String getScene_details() {
		return Scene_details;
	}
	public void setScene_details(String scene_details) {
		Scene_details = scene_details;
	}
	public String getScene_id() {
		return Scene_id;
	}
	public void setScene_id(String scene_id) {
		Scene_id = scene_id;
	}

}
