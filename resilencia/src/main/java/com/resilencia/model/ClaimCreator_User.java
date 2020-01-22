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
    private User_Registry creatorRegistry;

	public Long getIdClaim_Creator() {
		return idClaim_Creator;
	}

	public void setIdClaim_Creator(Long idClaim_Creator) {
		this.idClaim_Creator = idClaim_Creator;
	}

	public int getPhoneCreator() {
		return phoneCreator;
	}

	public void setPhoneCreator(int phoneCreator) {
		this.phoneCreator = phoneCreator;
	}

	public String getAdressCreator() {
		return adressCreator;
	}

	public void setAdressCreator(String adressCreator) {
		this.adressCreator = adressCreator;
	}

	public Long getIdClaim_Created() {
		return idClaim_Created;
	}

	public void setIdClaim_Created(Long idClaim_Created) {
		this.idClaim_Created = idClaim_Created;
	}

	public String getRolName() {
		return rolName;
	}

	public void setRolName(String rolName) {
		this.rolName = rolName;
	}

	public Set<Claim> getClaimsCreated() {
		return claimsCreated;
	}

	public void setClaimsCreated(Set<Claim> claimsCreated) {
		this.claimsCreated = claimsCreated;
	}

	public User_Registry getCreatorRegistry() {
		return creatorRegistry;
	}

	public void setCreatorRegistry(User_Registry creatorRegistry) {
		this.creatorRegistry = creatorRegistry;
	}
	
	
}
