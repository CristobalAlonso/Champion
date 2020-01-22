package com.resilencia.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/////////////////
//Primary Keys//
///////////////
@Entity
@Table(name="Admin_User")
public class Admin_User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idAdmin", nullable = false, unique = true)
	private Long idAdmin;
	
	@Column(name = "companyName", nullable = false)
	private String companyName;
	
	@Column(name="rolName", nullable = false, unique = false)
	private String rolName;
	
	@OneToMany(mappedBy="admin_User")
    private Set<Claim> claims;
	
/////////////////
//Foreign Keys//
///////////////
	@ManyToOne
	@JoinColumn(name="adminPending_Claim", nullable=false)
	private Claim claimAdmin;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mailUser_Admin", referencedColumnName = "mailUser")
    private User_Registry user_Registry;
	
}