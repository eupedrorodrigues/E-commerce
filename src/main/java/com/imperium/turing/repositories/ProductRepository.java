package com.imperium.turing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imperium.turing.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
