package com.jspider2.Hibernate2.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="passport_details")
public class Passport implements Serializable {
    @Id
    @Column(name="id")
    @GenericGenerator(name="relation_auto", strategy = "increment")
    @GeneratedValue(generator="relation_auto")
    private int id;
    
    @Column(name="passport_number")
    private String passportNumber;
    
    @Column(name="nationality")
    private String nationality;
    
    @Column(name="date_of_issue")
    private Date dateOfIssue;
    
    @Column(name="expiry_date")
    private Date expiryDate;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	
	
    
    
}
