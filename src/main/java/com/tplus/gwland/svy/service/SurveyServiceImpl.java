package com.tplus.gwland.svy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tplus.gwland.svy.domain.Survey;
import com.tplus.gwland.svy.domain.SurveyDto;
import com.tplus.gwland.svy.repository.SurveyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurveyServiceImpl implements SurveyService{
	private final SurveyRepository repo;
	
	public long save(Survey s) {return repo.save(s)!=null?1:0;}
	public Survey getOne(long id) {return repo.getOne(id);}
	public long delete(Survey s) {
		repo.delete(s);
		return getOne(s.getSvyNum())==null?1:0;
	}
	public long count() {return (long)repo.count();}
	public Boolean existsById(long id) {return repo.existsById(id);}
	public List<Survey> findAll() {return repo.findAll();}
}


