package com.tplus.gwland.svy.domain;

import lombok.Data;

@Data
public class SurveyDto {
	private int svyNum;
	private String gender;
	private String ageGroup;
	private String season;
	private String numberPeople;
	private String day;
	private String location;
	private String theme;
}
