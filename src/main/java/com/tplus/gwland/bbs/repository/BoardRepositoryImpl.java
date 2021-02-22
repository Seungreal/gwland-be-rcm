package com.tplus.gwland.bbs.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tplus.gwland.bbs.domain.Board;

@Repository
public class BoardRepositoryImpl implements BoardRepository{

	@Override
	public int insert(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Board> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board selectById(String bdNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

}
