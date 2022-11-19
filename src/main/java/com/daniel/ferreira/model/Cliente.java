package com.daniel.ferreira.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cliente_id;
	private String nome;
	

	public Cliente() {
		
	}
	

}
