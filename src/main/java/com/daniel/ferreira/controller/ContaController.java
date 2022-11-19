package com.daniel.ferreira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.ferreira.inteface.ContaRepository;
import com.daniel.ferreira.model.Conta;

@RestController
@RequestMapping("/conta")
public class ContaController {

	@Autowired
	private ContaRepository contaRepository;

	@GetMapping
	public List<Conta> list() {
		return contaRepository.findAll();
	}

	@GetMapping("/{id}")
	public Conta get(@PathVariable Long id) {
		return contaRepository.findById(id).get();
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		try {
			contaRepository.deleteById(id);
			return "Registro deletado!";
		} catch (Exception e) {
			// TODO: handle exception
			return "Erro ao remover registro! " + e.getMessage();
		}
	}

	@PostMapping
	public String save(@RequestBody Conta conta) {
		try {
			contaRepository.save(conta);
			return "Registro Salvo!";
		} catch (Exception e) {
			// TODO: handle exception
			return "Erro ao salvar registro! " + e.getMessage();
		}

	}

	@PutMapping
	public String put(@RequestBody Conta conta) {
		try {
			contaRepository.save(conta);
			return "Registro salvo!";
		} catch (Exception e) {
			// TODO: handle exception
			return "Erro ao salvar registro! " + e.getMessage();
		}

	}

}
