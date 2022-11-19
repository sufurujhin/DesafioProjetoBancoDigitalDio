package com.daniel.ferreira.inteface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.ferreira.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

}
