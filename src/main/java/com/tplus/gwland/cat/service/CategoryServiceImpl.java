package com.tplus.gwland.cat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tplus.gwland.cat.domain.Category;
import com.tplus.gwland.cat.repository.CategoryRepository;
import com.tplus.gwland.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl extends AbstractService<Category> implements CategoryService{
	private final CategoryRepository repo;
	
	@Override public int save(Category t) {
		return (repo.save(t) != null) ? 1 : 0;
	}

	@Override public int delete(Category t) {
		repo.delete(t);
		return (getOne(t.getCatNum()) == null) ? 1 : 0;
	}

	@Override public int count() {
		return (int) repo.count();
	}

	@Override public Category getOne(int id) {
		return repo.getOne(id);
	}

	@Override public Optional<Category> findById(int id) {
		return repo.findById(id);
	}

	@Override public boolean existsById(int id) {
		return repo.existsById(id);
	}

	@Override public List<Category> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Category> findByContentid(String contentid) {
		return repo.findByContentid(contentid);
	}

}
