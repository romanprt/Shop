package com.shop;

public class Order {
	private Long id;
	private String orderDate;
	public Order(Long id, String orderDate) {
	
		this.id = id;
		this.orderDate = orderDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + "]";
	}
	

}
