package com.tplus.gwland.rev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tplus.gwland.rev.domain.Review;

interface ReviewCustomRepository{
	public List<Review> findByRevName(String revName);
}

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewCustomRepository {
	
}

