package com.tplus.gwland.rev.repository;

import java.util.List;

import com.tplus.gwland.rev.domain.Review;



public interface ReviewRepository {

	public int insert(Review review);

	public List<Review> select();

	public Review selectById(String revNum);

	public int update(Review review);

	public int delete(Review review);


}