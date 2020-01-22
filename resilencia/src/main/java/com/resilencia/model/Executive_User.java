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
	private Long idReviwed_Claim;
	

	@Column(name = "sectionName", nullable = false, unique = false)
	private boolean sectionName;
	
	@Column(name="rolName", nullable = false, unique = false)
	private String rolName;
	
	
	
/////////////////
//Foreign Keys//
///////////////
	
	@OneToMany(mappedBy="executiveWork")
    private Set<Claim> executiveClaims;

	@OneToOne(mappedBy = "executiveReply")
	private Reply executiveReply; 
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mailUser_Executive", referencedColumnName = "mailUser")
    private User_Registry registryExecutive;

	public String getMailExecutive() {
		return mailExecutive;
	}

	public void setMailExecutive(String mailExecutive) {
		this.mailExecutive = mailExecutive;
	}

	public Long getIdReviwed_Claim() {
		return idReviwed_Claim;
	}

	public void setIdReviwed_Claim(Long idReviwed_Claim) {
		this.idReviwed_Claim = idReviwed_Claim;
	}

	public boolean isSectionName() {
		return sectionName;
	}

	public void setSectionName(boolean sectionName) {
		this.sectionName = sectionName;
	}

	public String getRolName() {
		return rolName;
	}

	public void setRolName(String rolName) {
		this.rolName = rolName;
	}

	public Set<Claim> getExecutiveClaims() {
		return executiveClaims;
	}

	public void setExecutiveClaims(Set<Claim> executiveClaims) {
		this.executiveClaims = executiveClaims;
	}

	public Reply getExecutiveReply() {
		return executiveReply;
	}

	public void setExecutiveReply(Reply executiveReply) {
		this.executiveReply = executiveReply;
	}

	public User_Registry getRegistryExecutive() {
		return registryExecutive;
	}

	public void setRegistryExecutive(User_Registry registryExecutive) {
		this.registryExecutive = registryExecutive;
	}
	
	
} 
