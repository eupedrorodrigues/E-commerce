package com.imperium.turing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imperium.turing.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
