package com.tplus.gwland.cli.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tplus.gwland.rev.domain.Review;
import com.tplus.gwland.svy.domain.Survey;

import lombok.Data;


@Entity
public class Client{
	@Id @Column(name="cli_num")private int cliNum;
	@Column(name="cliId") private String cliId;
	@Column(name="name") private String name;
	@Column(name="gender") private String gender;
	@Column(name="phoneNum") private String phoneNum;
	@Column(name="regDate") private String regDate;
	
	@OneToMany(mappedBy = "client")
    private List<Review> review = new ArrayList<>();
	
	@OneToMany(mappedBy = "client")
    private List<Survey> survey = new ArrayList<>();
}





// 디스크에 저장 -> 어노테이션 Entity