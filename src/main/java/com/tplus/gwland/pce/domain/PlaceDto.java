package com.tplus.gwland.pce.domain;

import lombok.Data;

@Data
public class PlaceDto {
	private int pceNum;
	private String name;
	private String address;
	private String phoneNumber;
	private String category;
	private String city;
	private String placeImg;
}