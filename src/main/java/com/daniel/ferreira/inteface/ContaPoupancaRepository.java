package com.daniel.ferreira.inteface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.ferreira.model.ContaPoupanca;

@Repository
public interface ContaPoupancaRepository extends JpaRepository<ContaPoupanca, Long> {

}
