package com.tplus.gwland.cli.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.cli.domain.ClientDto;
import com.tplus.gwland.cli.repository.ClientRepository;
import com.tplus.gwland.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl extends AbstractService<Client> implements ClientService {
	private final ClientRepository repo;

	@Override
	public long save(Client c) {return (repo.save(c) != null) ? 1 : 0;}
	@Override
	public long delete(Client c) {repo.delete(c); return (getOne(c.getCliNum()) == null) ? 1 : 0;}
	@Override
	public long count() {return (long) repo.count();}
	@Override
	public Client getOne(long id) {return repo.getOne(id);}
	@Override
	public Optional<Client> findById(long id) {return repo.findById(id);}
	@Override
	public boolean existsById(long id) {return repo.existsById(id);}
	@Override
	public List<Client> findAll() {return repo.findAll();}

	@Override
	public UserDetails loadUserByUsername(String cliIdOrcliEmail) throws UsernameNotFoundException {
		return ClientDto.create(
				repo.findByCliIdOrCliMail(cliIdOrcliEmail, cliIdOrcliEmail)
				.orElseThrow(() -> new UsernameNotFoundException("아이디나 이메일을 찾을 수 없음..."))
				);
	}
	public UserDetails loadCliById(Long cliNum) {
		Client client = repo.findById(cliNum)
							.orElseThrow(() -> new UsernameNotFoundException("User not found with id : " + cliNum));
		return ClientDto.create(client);
	}
	
	
	

	
	

}