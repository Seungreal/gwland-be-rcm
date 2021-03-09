package com.tplus.gwland.cli.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tplus.gwland.cli.domain.Client;

interface ClientCustomRepository {

}

public interface ClientRepository extends JpaRepository<Client, Long>, ClientCustomRepository {

	public Optional<Client> findByCliIdOrCliMail(String cliId, String cliMail);
	public List<Client> findByCliName(String cliName);
	public Optional<Client> findBycliMail(String cliMail);
	public Optional<Client> findBycliId(String cliId);
	public Boolean existsBycliId(String cliId);
	public Boolean existsBycliMail(String cliMail);
}
