package com.tplus.gwland.rev.repository;

import java.util.List;

import com.tplus.gwland.rev.domain.Review;



public interface ReviewRepository {

	public long insert(Review review);

	public List<Review> select();

	public Review selectById(String revNum);

	public long update(Review review);

	public long delete(Review review);


}
