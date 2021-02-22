package com.tplus.gwland.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tplus.gwland.bbs.domain.Board;
import com.tplus.gwland.bbs.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl {
	final BoardRepository boardMapper;
	
	public int write(Board board) {
		return boardMapper.insert(board);
	}
	public int list;
	public List<Board> list(){
		return boardMapper.select();
	}
	public Board selectById(String bdNum) {
		return boardMapper.selectById(bdNum);
	}
	public int update(Board board) {
		return boardMapper.update(board);
	}
	public int delete(Board board) {
		return boardMapper.delete(board);
	}

}

