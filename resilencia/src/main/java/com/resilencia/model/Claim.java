package com.resilencia.model;

import java.sql.Date;
import java.util.Set;

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

@Entity
@Table(name="Claim")
public class Claim {
	
/////////////////
//Primary Keys//
///////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idClaim", nullable = false, unique = true)
	private Long idClaim;
	
	@Column(name="idClaim_Creator", nullable = false, unique = false)
	private Long idClaim_Creator;
	
	@Column(name="creationDate", nullable = false, unique = false)
	private Date creationDate;
	
	@Column(name="placeEvent", nullable = false, unique = false)
	private String placeEvent;
	
	@Column(name="dateEvent", nullable = false, unique = false)
	private Date dateEvent;
	
	@Column(name="calificationGoods", nullable = false, unique = false)
	private int calificationGoods;
	
	@Column(name="calificationService", nullable = false, unique = false)
	private int calificationService;

	@Column(name="calificationEmployees", nullable = false, unique = false)
	private int calificationEmployees;

	@Column(name="statusClaim", nullable = false, unique = false)
	private String statusClaim;
	
	@Column(name="openingDate", nullable = false, unique = false)
	private Date openingDate;
	
	@Column(name ="categoryAsigned1", nullable = false, unique = false)
	private String categoryAsigned1;
	
	@Column(name ="categoryAsigned2", nullable = false, unique = false)
	private String categoryAsigned2;
	
	@Column(name ="categoryAsigned3", nullable = false, unique = false)
	private String categoryAsigned3;
	
	@Column(name ="executiveSuggest", nullable = true, unique = false)
	private String executiveSuggest;
	
	@OneToOne(mappedBy = "claim")
	private Reply reply;
	
	@OneToMany(mappedBy="claim")
	 private Set<Executive_User> executive_User;
	 
	@OneToMany(mappedBy="claim")
	private Set<Admin_User> admin_User;
	
/////////////////
//Foreign Keys//
///////////////
	 
	 
	 @ManyToOne
	 @JoinColumn(name="idUrgent_Claim", nullable=false)
	 private Admin_User admin_User;

	 @ManyToOne
	 @JoinColumn(name="idClaim_Creator", nullable=false)
	 private ClaimCreator_User claim_Creator;
	 
	 
	
	

}



}