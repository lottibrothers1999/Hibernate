package com.jspider2.Hibernate2.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name = "brand")
public class Brand implements Serializable {

	@Id
	@GenericGenerator(name = "brand_auto", strategy = "increment")
	@GeneratedValue(generator = "brand_auto")
	@Column(name = "brand_id")
	private int brandId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "origin_country")
	private String originCountry;
	
	@Column(name = "started_year")
	private Date startedYear;
	
	@Column(name = "features")
	private String features;
	
	@Column(name = "type")
	private String type;
	
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn( name = "b_id")
	private List<Model> models;

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public Date getStartedYear() {
		return startedYear;
	}

	public void setStartedYear(Date startedYear) {
		this.startedYear = startedYear;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}
	
	
	
}
