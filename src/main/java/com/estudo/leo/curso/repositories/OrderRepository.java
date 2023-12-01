package com.estudo.leo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.leo.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
