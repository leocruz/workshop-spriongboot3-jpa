package com.estudo.leo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.leo.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
