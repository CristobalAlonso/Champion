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
	
	@OneToMany(mappedBy="claim")
	 private Set<Executive_User> executiveClaim;
	 
/////////////////
//Foreign Keys//
///////////////
	 
	 @OneToOne(mappedBy = "claim")
	 private Reply replyClaim;
	
	 @ManyToOne
	 @JoinColumn(name="idUrgent_Claim", nullable=false)
	 private Admin_User admin_User;

	 @ManyToOne
	 @JoinColumn(name="idClaim_Creator", nullable=false)
	 private ClaimCreator_User claim_Creator;
	 
	 @ManyToOne
	 @JoinColumn(name="idClaimTo_Respond", nullable=false)
	 private Executive_User executiveWork;

	public Long getIdClaim() {
		return idClaim;
	}

	public void setIdClaim(Long idClaim) {
		this.idClaim = idClaim;
	}

	public Long getIdClaim_Creator() {
		return idClaim_Creator;
	}

	public void setIdClaim_Creator(Long idClaim_Creator) {
		this.idClaim_Creator = idClaim_Creator;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getPlaceEvent() {
		return placeEvent;
	}

	public void setPlaceEvent(String placeEvent) {
		this.placeEvent = placeEvent;
	}

	public Date getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public int getCalificationGoods() {
		return calificationGoods;
	}

	public void setCalificationGoods(int calificationGoods) {
		this.calificationGoods = calificationGoods;
	}

	public int getCalificationService() {
		return calificationService;
	}

	public void setCalificationService(int calificationService) {
		this.calificationService = calificationService;
	}

	public int getCalificationEmployees() {
		return calificationEmployees;
	}

	public void setCalificationEmployees(int calificationEmployees) {
		this.calificationEmployees = calificationEmployees;
	}

	public String getStatusClaim() {
		return statusClaim;
	}

	public void setStatusClaim(String statusClaim) {
		this.statusClaim = statusClaim;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public String getCategoryAsigned1() {
		return categoryAsigned1;
	}

	public void setCategoryAsigned1(String categoryAsigned1) {
		this.categoryAsigned1 = categoryAsigned1;
	}

	public String getCategoryAsigned2() {
		return categoryAsigned2;
	}

	public void setCategoryAsigned2(String categoryAsigned2) {
		this.categoryAsigned2 = categoryAsigned2;
	}

	public String getCategoryAsigned3() {
		return categoryAsigned3;
	}

	public void setCategoryAsigned3(String categoryAsigned3) {
		this.categoryAsigned3 = categoryAsigned3;
	}

	public String getExecutiveSuggest() {
		return executiveSuggest;
	}

	public void setExecutiveSuggest(String executiveSuggest) {
		this.executiveSuggest = executiveSuggest;
	}

	public Set<Executive_User> getExecutiveClaim() {
		return executiveClaim;
	}

	public void setExecutiveClaim(Set<Executive_User> executiveClaim) {
		this.executiveClaim = executiveClaim;
	}

	public Reply getReplyClaim() {
		return replyClaim;
	}

	public void setReplyClaim(Reply replyClaim) {
		this.replyClaim = replyClaim;
	}

	public Admin_User getAdmin_User() {
		return admin_User;
	}

	public void setAdmin_User(Admin_User admin_User) {
		this.admin_User = admin_User;
	}

	public ClaimCreator_User getClaim_Creator() {
		return claim_Creator;
	}

	public void setClaim_Creator(ClaimCreator_User claim_Creator) {
		this.claim_Creator = claim_Creator;
	}

	public Executive_User getExecutiveWork() {
		return executiveWork;
	}

	public void setExecutiveWork(Executive_User executiveWork) {
		this.executiveWork = executiveWork;
	}
	
	 
	 
	 

}

