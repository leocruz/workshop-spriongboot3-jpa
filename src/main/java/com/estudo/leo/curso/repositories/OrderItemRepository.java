package com.estudo.leo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.leo.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
