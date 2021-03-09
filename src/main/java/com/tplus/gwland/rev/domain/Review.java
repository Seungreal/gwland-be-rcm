package com.tplus.gwland.rev.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.rcm.domain.Recom;

import lombok.Getter;

@Entity @Getter @Table(name = "review")
public class Review {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rev_num")private long revNum;
	@Column(name="rev_id")private long revId;
	@Column(name="rev_star")private long revStar;
	@Column(name="rev_content")private long revContent;
	@Column(name="rev_date")private long revDate;
	
	@OneToMany(mappedBy= "review")
	private List<Recom> recom = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="cli_num")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="pce_num")
	private Place place;

	

	
	}
	
	






