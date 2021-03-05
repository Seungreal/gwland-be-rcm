package com.tplus.gwland.svy.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.rcm.domain.Recom;

import lombok.Getter;

@Entity @Getter
public class Survey {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="svy_num")
	private int svyNum;
	@Column
	private String gender;
	@Column(name="age_group")
	private String ageGroup;
	@Column
	private String season;
	@Column(name="number_people")
	private String numberPeople;
	@Column
	private String day;
	@Column
	private String location;
	@Column
	private String theme;
	
	@ManyToOne
	@JoinColumn(name="pce_num")
	private Place place;
	@ManyToOne
	@JoinColumn(name="cli_num")
	private Client client;
	
	@OneToMany(mappedBy = "survey",fetch = FetchType.EAGER)
	private List<Recom> RecomList = new ArrayList<>();
}
