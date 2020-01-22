package com.resilencia.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ClaimCreator_User")
public class ClaimCreator_User {
	
/////////////////
//Primary Keys//
///////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idClaim_Creator", nullable = false, unique = true)
	private Long idClaim_Creator;
	
	@Column(name = "phoneCreator", nullable = true, unique = true)
	private int phoneCreator;
	
	@Column(name = "adressCreator", nullable = true, unique = false)
	private	String adressCreator;
	
	@Column(name = "idClaim_Created", nullable = false, unique = true)
	private Long idClaim_Created;
	
	@Column(name="rolName", nullable = false, unique = false)
	private String rolName;
	
	
	@OneToMany(mappedBy="claim_Creator")
    private Set<Claim> claimsCreated;
	
/////////////////
//Foreign Keys//
///////////////

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mailUser_ClaimCreator", referencedColumnName = "mailUser")
    private User_Registry user_Registry;
	
}
