package com.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}
