package com.Model;

public class JourneyPlan {

	private String journey_name;
	private String journey_plan;
	private String journey_money;
	@Override
	public String toString() {
		return journey_name;
	}
	public String getJourney_name() {
		return journey_name;
	}
	public void setJourney_name(String journey_name) {
		this.journey_name = journey_name;
	}
	public String getJourney_plan() {
		return journey_plan;
	}
	public void setJourney_plan(String journey_plan) {
		this.journey_plan = journey_plan;
	}
	public String getJourney_money() {
		return journey_money;
	}
	public void setJourney_money(String journey_money) {
		this.journey_money = journey_money;
	}
}
