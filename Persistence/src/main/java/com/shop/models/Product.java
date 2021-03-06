package com.shop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length = 45)
	private String nameProduct;
	@Column(length = 45)
	private String price;
	@Column(length = 45)
	private String description;
	@Column(length = 45)
	private String amount;
	public Product(Long id, String nameProduct, String price, String description, String amount) {
	
		this.id = id;
		this.nameProduct = nameProduct;
		this.price = price;
		this.description = description;
		this.amount = amount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", nameProduct=" + nameProduct + ", price=" + price + ", description="
				+ description + ", amount=" + amount + "]";
	}
	
	
}
