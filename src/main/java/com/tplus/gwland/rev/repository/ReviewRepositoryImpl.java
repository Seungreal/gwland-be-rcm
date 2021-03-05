package com.tplus.gwland.rev.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tplus.gwland.rev.domain.Review;

@Repository
public class ReviewRepositoryImpl implements ReviewRepository{

	@Override
	public int insert(Review review) {
		return 0;
	}

	@Override
	public List<Review> select() {
		return null;
	}

	@Override
	public Review selectById(String revNum) {
		return null;
	}

	@Override
	public int update(Review review) {
		return 0;
	}

	@Override
	public int delete(Review review) {
		return 0;
	}



}
