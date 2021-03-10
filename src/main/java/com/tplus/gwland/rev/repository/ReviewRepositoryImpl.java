package com.tplus.gwland.rev.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.tplus.gwland.rev.domain.Review;

@Repository
public class ReviewRepositoryImpl extends QuerydslRepositorySupport implements ReviewCustomRepository{
	private final EntityManager em;
	public ReviewRepositoryImpl(EntityManager em) {
		super(Review.class);
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Review> findByRevName(String revName) {
		return em.createQuery("select b from review b where b.rev_name like :revName")
				 .setParameter("revName", revName)
				 .getResultList();
	}
}
