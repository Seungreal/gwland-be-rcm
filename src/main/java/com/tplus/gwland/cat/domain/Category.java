package com.tplus.gwland.cat.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.tplus.gwland.pce.domain.Place;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cat_num") private int catNum;
	
	@OneToMany(mappedBy="category")
	private List<Place> placeList = new ArrayList<>();
}
