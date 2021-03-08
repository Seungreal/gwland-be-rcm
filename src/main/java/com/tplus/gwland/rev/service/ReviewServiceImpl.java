package com.tplus.gwland.rev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tplus.gwland.rev.domain.Review;
import com.tplus.gwland.rev.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService{
	final ReviewRepository repository;
	
	public long write(Review review) {
		return repository.insert(review);
	}
	public long list;
	public List<Review> list(){
		return repository.select();
	}
	public Review selectById(String revNum) {
		return repository.selectById(revNum);
	}
	public long update(Review review) {
		return repository.update(review);
	}
	public long delete(Review review) {
		return repository.delete(review);
	}

}

