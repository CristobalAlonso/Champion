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
	
	public Long getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRolName() {
		return rolName;
	}

	public void setRolName(String rolName) {
		this.rolName = rolName;
	}

	public Set<Claim> getAdminClaims() {
		return adminClaims;
	}

	public void setAdminClaims(Set<Claim> adminClaims) {
		this.adminClaims = adminClaims;
	}

	public User_Registry getAdminRegistry() {
		return adminRegistry;
	}

	public void setAdminRegistry(User_Registry adminRegistry) {
		this.adminRegistry = adminRegistry;
	}

	@Column(name = "companyName", nullable = false)
	private String companyName;
	
	@Column(name="rolName", nullable = false, unique = false)
	private String rolName;
	
	@OneToMany(mappedBy="admin_User")
    private Set<Claim> adminClaims;
	
/////////////////
//Foreign Keys//
///////////////
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mailUser_Admin", referencedColumnName = "mailUser")
    private User_Registry adminRegistry;
	
}