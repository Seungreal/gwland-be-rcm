package com.tplus.gwland.svy.domain;

import lombok.Data;

@Data
public class SurveyDto {
	private int svyNum;
	private String gender;
	private String age;
	private String season;
	private String partner;
	private String duration;
	private String location;
	private String theme;
}