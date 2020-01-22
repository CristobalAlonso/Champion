package com.resilencia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.resilencia.model.Executive_User;

public interface Executive_User_Repo extends JpaRepository<Executive_User, String>{
	boolean findByMailExecutiveAndPass(String email, String pass);
	List<Executive_User> findAll();
}
