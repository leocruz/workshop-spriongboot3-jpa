package com.estudo.leo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.leo.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
