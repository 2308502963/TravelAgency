package com.Model;

public class ScenePlan {
	private String id;
	@Override
	public String toString() {
		return Scene_name;
	}
	private String Scene_name;
	private String Scene_plan;
	private String Scene_money;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getScene_name() {
		return Scene_name;
	}
	public void setScene_name(String scene_name) {
		Scene_name = scene_name;
	}
	public String getScene_plan() {
		return Scene_plan;
	}
	public void setScene_plan(String scene_plan) {
		Scene_plan = scene_plan;
	}
	public String getScene_money() {
		return Scene_money;
	}
	public void setScene_money(String scene_money) {
		Scene_money = scene_money;
	}
}
