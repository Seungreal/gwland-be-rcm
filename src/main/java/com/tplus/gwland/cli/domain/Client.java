package com.tplus.gwland.cli.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tplus.gwland.rev.domain.Review;
import com.tplus.gwland.svy.domain.Survey;

import lombok.Data;
import lombok.Getter;


@Entity @Getter
@NamedQuery(
		name="Client.findBycliName",
		query = "select b from Client b where b.cli_name like : cliName")
@NamedQuery(
		name="Client.findBycliAge",
		query = "select b from Client b where b.cli_age like : cliAge")

public class Client{
	@Id @Column(name="cli_num")private int cliNum;
	@Column(name="cli_id") private String cliId;
	@Column(name="cli_name") private String cliName;
	@Column(name="cli_gen") private String cliGen;
	@Column(name="cli_mail") private String cliMail;
	@Column(name="cli_age") private String cliAge;
	
	@OneToMany(mappedBy = "client")
    private List<Review> review = new ArrayList<>();
	
	@OneToMany(mappedBy = "client")
    private List<Survey> survey = new ArrayList<>();
}



// 디스크에 저장 -> 어노테이션 Entity