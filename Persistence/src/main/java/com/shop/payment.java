package com.shop;

public class payment {

	private Long id;
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