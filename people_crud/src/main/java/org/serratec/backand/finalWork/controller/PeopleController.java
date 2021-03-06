package org.serratec.backand.finalWork.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.serratec.backand.finalWork.models.PeopleEntity;
import org.serratec.backand.finalWork.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

	@Autowired
	private PeopleRepository pessoaRepository;

	// metodo para retornar lista de pessoas, padão JPA
	@GetMapping("/people")
	public List<PeopleEntity> getAll() {
		return pessoaRepository.findAll();
	}

//metodo para procurar pessoa pelo id
	@GetMapping("/people/{id}")
	public ResponseEntity<PeopleEntity> GetById(@PathVariable(value = "id") Long id) {
		Optional<PeopleEntity> pessoa = pessoaRepository.findById(id);
		if (pessoa.isPresent()) {
			return new ResponseEntity<PeopleEntity>(pessoa.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

//metodo para criar uma nova pessoa
	@PostMapping("/people")
	public PeopleEntity create(@Valid @RequestBody PeopleEntity newPeople) {
		return pessoaRepository.save(newPeople);
	}

//metodo para alterar ou atualizar uma pessoa
	@PutMapping("/people/{id}")
	public ResponseEntity<PeopleEntity> update(@PathVariable(value = "id") long id,
			@Valid @RequestBody PeopleEntity newPeople) {
		Optional<PeopleEntity> oldPeople = pessoaRepository.findById(id);
		if (oldPeople.isPresent()) {
			PeopleEntity pessoa = oldPeople.get();
			pessoa.setNome(newPeople.getNome());
			pessoaRepository.save(pessoa);
			return new ResponseEntity<PeopleEntity>(pessoa, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<PeopleEntity> delete(@PathVariable(value = "id") Long id) {
		Optional<PeopleEntity> people = pessoaRepository.findById(id);
		if (people.isPresent()) {
			pessoaRepository.delete(people.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}