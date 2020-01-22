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

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String getPassUser() {
		return passUser;
	}

	public void setPassUser(String passUser) {
		this.passUser = passUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getLastName_User() {
		return lastName_User;
	}

	public void setLastName_User(String lastName_User) {
		this.lastName_User = lastName_User;
	}

	public String getRolUser() {
		return rolUser;
	}

	public void setRolUser(String rolUser) {
		this.rolUser = rolUser;
	}

	public Admin_User getAdmin_User() {
		return admin_User;
	}

	public void setAdmin_User(Admin_User admin_User) {
		this.admin_User = admin_User;
	}

	public Executive_User getExecutive_User() {
		return executive_User;
	}

	public void setExecutive_User(Executive_User executive_User) {
		this.executive_User = executive_User;
	}

	public ClaimCreator_User getClaimCreator_User() {
		return claimCreator_User;
	}

	public void setClaimCreator_User(ClaimCreator_User claimCreator_User) {
		this.claimCreator_User = claimCreator_User;
	}
	
	
	
}