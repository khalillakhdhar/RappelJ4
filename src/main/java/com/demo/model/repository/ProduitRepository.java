package com.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
