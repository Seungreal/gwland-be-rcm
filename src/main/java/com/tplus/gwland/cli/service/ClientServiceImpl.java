package com.tplus.gwland.cli.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.cli.repository.ClientRepository;
import com.tplus.gwland.rev.repository.ReviewRepository;
import com.tplus.gwland.rev.service.ReviewServiceImpl;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
	
	final ClientRepository repository;
	 
	public int list;
	
	public int detail;
	 
	 public List<Client> list(){
	  return repository.list();
   }
	public int delete(Client c) {
		return repository.delete(c);
	}
	public int update(Client c) {
		return repository.update(c);
	}
	
	public Client detail(String cliId){
		  return repository.detail(cliId);
	   }
}