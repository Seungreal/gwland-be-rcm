package com.tplus.gwland.pce.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

/*
	create table places(
		pce_num int primary key auto_increment,
		name varchar(20),
		address varchar(100),
		phone_number varchar(50),
		category varchar(20),
		city varchar(20),
		placeImg text
	);
 */
@Data
public class Place {
	@Id
	@Column(name="pce_num") private int pceNum;
	@Column(name="name") private String name;
	@Column(name="address") private String address;
	@Column(name="phoneNumber") private String phoneNumber;
	@Column(name="category") private String category;
	@Column(name="city") private String city;
	@Column(name="place_img") private String placeImg;
}
