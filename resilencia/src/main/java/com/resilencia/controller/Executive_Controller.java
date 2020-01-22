package com.resilencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resilencia.imp.Executive_User_Imp;
import com.resilencia.model.Executive_User;
import com.resilencia.util.QueryResult;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/Ejecutivo")
public class Executive_Controller {
	
	@Autowired
	private Executive_User_Imp excutiveImp;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> saveEjecutivo(@RequestBody Executive_User ejecutivo) {
		ResponseEntity<Object> x = null;
		try {
			x = new ResponseEntity<Object>(excutiveImp.save(ejecutivo), HttpStatus.OK) ;
		}catch(Exception ex) {
			ex.printStackTrace();
			x =  new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		return x;
	}
	
	@RequestMapping(value="/SearchExecutive",method = RequestMethod.POST)
	public ResponseEntity<Object> searchExecutive(@RequestBody Executive_User executive) {
		ResponseEntity<Object> x = null;
		try {
			x = new ResponseEntity<Object>(excutiveImp.findByMailExecutiveAndPass(executive.getMailExecutive(), executive.getPass()), HttpStatus.OK) ;
		}catch(Exception ex) {
			ex.printStackTrace();
			x =  new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		return x;
	}

}
