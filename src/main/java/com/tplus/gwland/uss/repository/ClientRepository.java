package com.tplus.gwland.uss.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tplus.gwland.uss.domain.Client;


@Repository
public interface ClientRepository {
	
	public int insert(Client c);
	
	public List<Client> list();
	
	public int delete(Client c);

	public int update(Client c);

	public Client detail(String cliId);
	
}
