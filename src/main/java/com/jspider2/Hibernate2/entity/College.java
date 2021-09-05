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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="college")
public class College implements Serializable {
	@Id
	@GenericGenerator(name = "brand_auto", strategy = "increment")
	@GeneratedValue(generator = "brand_auto")
	@Column(name = "college_code")
   private int id;
	
	@Column(name = "college_name")
   private String collage_name;
	
	@Column(name = "no_of_vacancies")
   private int no_of_vacancies;
	
	@Column(name = "college_place")
   private String college_place;
	
	




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCollage_name() {
	return collage_name;
}
public void setCollage_name(String collage_name) {
	this.collage_name = collage_name;
}
public int getNo_of_vacancies() {
	return no_of_vacancies;
}
public void setNo_of_vacancies(int no_of_vacancies) {
	this.no_of_vacancies = no_of_vacancies;
}
public String getCollege_place() {
	return college_place;
}
public void setCollege_place(String college_place) {
	this.college_place = college_place;
}
   
   
}
