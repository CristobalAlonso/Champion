package com.resilencia.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Executive_User")
public class Executive_User {
	
/////////////////
//Primary Keys//
///////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idExecutive", nullable = false, unique = true)
	private String mailExecutive;
	
	@Column(name="idReviwed_Claim", nullable = false,  unique = false)
	private ArrayList idReviwed_Claim;
	

	@Column(name = "sectionName", nullable = false, unique = false)
	private boolean sectionName;
	
	@Column(name="rolName", nullable = false, unique = false)
	private String rolName;

	@OneToOne(mappedBy = "executive_User")
	private Reply reply;
	
	
/////////////////
//Foreign Keys//
///////////////

	     
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mailUser_Executive", referencedColumnName = "mailUser")
    private User_Registry user_Registry;
	
} 
