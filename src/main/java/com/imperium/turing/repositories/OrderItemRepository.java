package com.imperium.turing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imperium.turing.entities.OrderItem;
import com.imperium.turing.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
