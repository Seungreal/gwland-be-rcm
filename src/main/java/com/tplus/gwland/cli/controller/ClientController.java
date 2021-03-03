package com.tplus.gwland.cli.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.cli.service.ClientServiceImpl;
import com.tplus.gwland.cmm.controller.AbstractController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController extends AbstractController<Client>{
	final ClientServiceImpl service;

	@GetMapping("/save")
	public ResponseEntity<Integer> save(Client t) {
		return ResponseEntity.ok(service.save(t));
	}

	@GetMapping("/delete")
	public ResponseEntity<Integer> delete(Client t) {
		return ResponseEntity.ok(service.delete(t));
	}

	@GetMapping("/count")
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Client> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Client>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(int id) {
		return ResponseEntity.ok(service.existsById(id));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Client>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	    

}






