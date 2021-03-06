package org.serratec.backand.finalWork.controllers;

import java.util.List;

import org.serratec.backand.finalWork.models.Clients;
import org.serratec.backand.finalWork.repository.Client_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class Clients_Controller {

	@Autowired
	private Client_Repository repository;
	
	
	@GetMapping
	public List<Clients> Listar(){
		return repository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Clients add(@RequestBody Clients  clients) {
		return repository.save(clients);
	}
	
	
	
	
	
}
