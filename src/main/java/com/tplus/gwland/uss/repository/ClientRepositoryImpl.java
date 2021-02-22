package com.tplus.gwland.uss.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tplus.gwland.uss.domain.Client;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

	@Override
	public int insert(Client c) {
		return 0;
	}

	@Override
	public List<Client> list() {
		return null;
	}

	@Override
	public int delete(Client c) {
		return 0;
	}

	@Override
	public int update(Client c) {
		return 0;
	}

	@Override
	public Client detail(String cliId) {
		return null;
	}

}
