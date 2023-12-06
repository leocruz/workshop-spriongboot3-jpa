package com.estudo.leo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.leo.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
