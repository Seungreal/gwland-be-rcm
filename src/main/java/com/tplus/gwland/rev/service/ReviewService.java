package com.tplus.gwland.rev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tplus.gwland.rev.domain.Review;
import com.tplus.gwland.rev.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewService {
	private ReviewRepository boardMapper;
	
	public int write(Review board) {
		return boardMapper.insert(board);
	}
	public int list;
	public List<Review> list(){
		return boardMapper.select();
	}
	public Review selectById(String bdNum) {
		return boardMapper.selectById(bdNum);
	}
	public int update(Review board) {
		return boardMapper.update(board);
	}
	public int delete(Review board) {
		return boardMapper.delete(board);
	}

}

