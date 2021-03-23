package com.tplus.gwland.cli.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.cli.service.ClientServiceImpl;
import com.tplus.gwland.cmm.controller.AbstractController;


import lombok.RequiredArgsConstructor;

@RestController 
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor 
@RequestMapping("/api/client")

public class ClientController extends AbstractController<Client>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	final ClientServiceImpl service;

	@GetMapping("/save")
	public ResponseEntity<Long> save(Client c) {return ResponseEntity.ok(service.save(c));}

	@DeleteMapping("/delete")
	public ResponseEntity<Long> delete(Client c) {return ResponseEntity.ok(service.delete(c));}

	@GetMapping("/count")
	public ResponseEntity<Long> count() {return ResponseEntity.ok(service.count());}

	@GetMapping("/all")
	public ResponseEntity<List<Client>> findAll() {return ResponseEntity.ok(service.findAll());}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<Client> getOne(long id) {return ResponseEntity.ok(service.getOne(id));}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Client>> findById(long id) {return ResponseEntity.ok(service.findById(id));}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(long id) {return ResponseEntity.ok(service.existsById(id));}

}