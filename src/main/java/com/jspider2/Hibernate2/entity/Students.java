package com.jspider2.Hibernate2.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="student")
public class Students implements Serializable {
	@Id
	@GenericGenerator(name = "brand_auto", strategy = "increment")
	@GeneratedValue(generator = "brand_auto")
	@Column(name = "student_id")	
  private int id;
	
 @Column(name = "name")
  private String name;
 
 @Column(name = "age")
  private int age;
 
 @Column(name = "mobile")
  private double mobile;
 
 @Column(name = "branch")
  private String branch;
 
 @ManyToOne( cascade = CascadeType.ALL)
@JoinColumn( name = "c_code")
private College clgg;

 
 
public College getClgg() {
	return clgg;
}

public void setClgg(College clgg) {
	this.clgg = clgg;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getMobile() {
	return mobile;
}

public void setMobile(double mobile) {
	this.mobile = mobile;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}
  
  
  
}
