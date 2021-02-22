package com.tplus.gwland.bbs.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tplus.gwland.bbs.domain.Board;



public interface BoardRepository {

	public int insert(Board board);

	public List<Board> select();

	public Board selectById(String bdNum);

	public int update(Board board);

	public int delete(Board board);


}
