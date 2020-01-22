package com.resilencia.service;

import java.util.List;


import com.resilencia.model.Executive_User;

public interface IExecutive_User_Service {
	
	boolean save(Executive_User execuive);	
	boolean findByMailExecutiveAndPass(String email, String pass);
	List<Executive_User> findAll();
	List<Executive_User> findById(String email);
	boolean deleteById(String mail);

}
