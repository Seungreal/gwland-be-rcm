package com.tplus.gwland.uss.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Client{
	@Id private int cliNum;
	@Column(name="cliId") private String cliId;
	@Column(name="name") private String name;
	@Column(name="gender") private String gender;
	@Column(name="phoneNum") private String phoneNum;
	@Column(name="regDate") private String regDate;
}

// 디스크에 저장 -> 어노테이션 Entity