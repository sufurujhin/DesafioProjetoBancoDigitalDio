package com.daniel.ferreira.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class APIController {

	@GetMapping
	@PutMapping
	@PostMapping
	@DeleteMapping
	public String status() {
		return "Desafio de Projeto de Banco digital DIO";
	}
}
