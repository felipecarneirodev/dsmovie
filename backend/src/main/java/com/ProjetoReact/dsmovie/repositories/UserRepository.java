package com.ProjetoReact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoReact.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
