package com.tplus.gwland.pce.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tplus.gwland.pce.domain.Place;

@Repository
public class PlaceRepositoryImpl implements PlaceRepository{

	@Override
	public int insert(Place p) {
		return 0;
	}

	@Override
	public int count() {
		return 0;
	}

	@Override
	public List<Place> list() {
		return null;
	}

	@Override
	public Place select(String pceNum) {
		return null;
	}

	@Override
	public int delete(Place p) {
		return 0;
	}

	@Override
	public int update(Place p) {
		return 0;
	}

}
