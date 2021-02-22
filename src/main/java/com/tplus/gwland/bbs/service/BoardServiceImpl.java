package com.tplus.gwland.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tplus.gwland.bbs.domain.Board;
import com.tplus.gwland.bbs.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
	final BoardRepository repository;
	
	public int write(Board board) {
		return repository.insert(board);
	}
	public int list;
	public List<Board> list(){
		return repository.select();
	}
	public Board selectById(String bdNum) {
		return repository.selectById(bdNum);
	}
	public int update(Board board) {
		return repository.update(board);
	}
	public int delete(Board board) {
		return repository.delete(board);
	}

}

