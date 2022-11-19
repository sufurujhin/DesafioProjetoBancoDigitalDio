package com.daniel.ferreira.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity(name = "conta_poupanca")
public class ContaPoupanca extends Conta implements Serializable{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
