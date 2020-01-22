package com.resilencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Registry")
public class User_Registry {
	
/////////////////
//Primary Keys//
///////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="mailUser", nullable = false, unique = true)
	private String mailUser;
	
	@Column(name = "passUser", nullable = false, unique = false)
	private String passUser;
	
	@Column (name = "nameUser", nullable = false, unique = false)
	private String nameUser;
	
	@Column (name = "lastName_User", nullable = false, unique = false)
	private String lastName_User;
	
	@Column(name="rolUser", nullable = false, unique = false)
	private String rolUser;

	@OneToOne(mappedBy = "user_Registry")
	private Admin_User admin_User;
	
	@OneToOne(mappedBy = "user_Registry")
	private Executive_User executive_User;
	
	@OneToOne(mappedBy = "user_Registry")
	private ClaimCreator_User claimCreator_User;
	
}