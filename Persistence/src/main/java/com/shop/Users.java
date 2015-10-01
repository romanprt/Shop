package com.shop;

public class Users {
	private Long id;
	private String name;
	private String telephone;
	private String email;
	private String userPassword;
	public Users(Long id, String name, String telephone, String email, String userPassword) {
		
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.userPassword = userPassword;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", telephone=" + telephone + ", email=" + email
				+ ", userPassword=" + userPassword + "]";
	}

	

}
