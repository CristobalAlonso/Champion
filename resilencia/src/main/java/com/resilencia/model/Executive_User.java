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
	
	@Column(name="rolPass", nullable = false, unique = false)
	private String pass;

	@OneToOne(mappedBy = "executive_User")
	private Reply reply;
	
	
	
	public String getMailExecutive() {
		return mailExecutive;
	}
	public void setMailExecutive(String mailExecutive) {
		this.mailExecutive = mailExecutive;
	}
	public ArrayList getIdReviwed_Claim() {
		return idReviwed_Claim;
	}
	public void setIdReviwed_Claim(ArrayList idReviwed_Claim) {
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Reply getReply() {
		return reply;
	}
	public void setReply(Reply reply) {
		this.reply = reply;
	}
	public User_Registry getUser_Registry() {
		return user_Registry;
	}
	public void setUser_Registry(User_Registry user_Registry) {
		this.user_Registry = user_Registry;
	}
	
/////////////////
//Foreign Keys//
///////////////

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mailUser_Executive", referencedColumnName = "mailUser")
    private User_Registry user_Registry;
	
} 
