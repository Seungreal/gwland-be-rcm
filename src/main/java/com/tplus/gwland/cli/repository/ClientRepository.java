package com.tplus.gwland.cli.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.cli.domain.ClientDto;

interface IClientRepository{
	public List<Client> findBycliName(String cliName);
	public List<Client> findByfindBycliAge(String cliAge);
	public List<ClientDto> findBycliNum(String cliNum);

	
}
public interface ClientRepository extends JpaRepository<Client, Integer>, IClientRepository{
	
	
}
