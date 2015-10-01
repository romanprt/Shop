package com.shop;

public class GroupProduct {
	private Long id;
	private String nameGroup;

	public GroupProduct(Long id, String nameGroup) {
		
		this.id = id;
		this.nameGroup = nameGroup;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	@Override
	public String toString() {
		return "GroupProduct [id=" + id + ", nameGroup=" + nameGroup + "]";
	}

}
