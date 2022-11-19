package com.daniel.ferreira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.ferreira.inteface.ClienteRepository;
import com.daniel.ferreira.model.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;

	/* listar todos os clientes */
	@GetMapping
	public List<Cliente> list() {
		return clienteRepository.findAll();
	}

	/* Selecionando cliente */
	@GetMapping("/{id}")
	public Cliente get(@PathVariable("id") Long id) {
		return clienteRepository.findById(id).get();
	}

	/* Removendo cliente */
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long id) {
		try {
			clienteRepository.deleteById(id);
			return "Cliente removido!";
		} catch (Exception e) {
			return "Erro ao remover cliente! " + e.getMessage();
		}
	}

	/* Alterando cliente */
	@PutMapping
	public String put(@RequestBody Cliente cliente) {
		try {
			clienteRepository.save(cliente);
			return "Dados Alterados!";
		} catch (Exception e) {
			return "Erro ao alterar registro, " + e.getMessage();
		}
	}

	/* Cadastrando cliente */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
