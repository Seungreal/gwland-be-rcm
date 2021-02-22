package com.tplus.gwland.pce.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tplus.gwland.cmm.domain.Pagination;
import com.tplus.gwland.pce.domain.Place;
import com.tplus.gwland.pce.repository.PlaceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService{
	private
	PlaceRepository placeMapper;

	public int add(Place p) {
		return placeMapper.insert(p);
	}

	public int count() {
		return placeMapper.count();
	}

	public List<Place> list(Pagination page) {
		return null;/*placeMapper.list().stream()
				.sorted(Comparator.comparing(Place::getPceNum).reversed())
				.skip(page.getStartRow()-1)
				.limit(page.getPageSize())
				.collect(Collectors.toList());*/
	}

	public Place detail(String pceNum) {
		return placeMapper.select(pceNum);
	}

	public int delete(Place p) {
		return placeMapper.delete(p);
	}

	public int update(Place p) {
		
		return placeMapper.update(p);
	}

}
