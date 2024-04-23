package com.imperium.turing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imperium.turing.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
