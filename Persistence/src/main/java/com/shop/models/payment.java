package com.shop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length = 45)
	private String namePayment;
	public payment(Long id, String namePayment) {
		
		this.id = id;
		this.namePayment = namePayment;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNamePayment() {
		return namePayment;
	}
	public void setNamePayment(String namePayment) {
		this.namePayment = namePayment;
	}
	@Override
	public String toString() {
		return "payment [id=" + id + ", namePayment=" + namePayment + "]";
	}
	
	
	
}