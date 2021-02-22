package com.tplus.gwland.cli.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.cli.repository.ClientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService  {
	private ClientRepository mapper;
	 public int list;
	public int detail;
	 
	 public List<Client> list(){
	  return mapper.list();
   }
	public int delete(Client c) {
		return mapper.delete(c);
	}
	public int update(Client c) {
		return mapper.update(c);
	}
	
	public Client detail(String cliId){
		  return mapper.detail(cliId);
	   }
}