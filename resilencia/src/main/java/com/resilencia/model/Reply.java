package com.resilencia.model;

import java.sql.Date;

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
@Table(name="Reply")
public class Reply {
	
/////////////////
//Primary Keys//
///////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idReply", nullable = false, unique = true)
	private Long idReplay;

	@Column(name="excutivesText_Box", nullable = false, unique = true)
	private String excutivesText_Box;
	
	@Column(name="shippingDate", nullable = false, unique = false)
	private Date shippingDate;
	
/////////////////
//Foreign Keys//
///////////////

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idAnswered_Claim", referencedColumnName = "idClaim")
    private Claim claim;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idExecutive_Creator", referencedColumnName = "idExecutive")
    private Executive_User executive_User;
}