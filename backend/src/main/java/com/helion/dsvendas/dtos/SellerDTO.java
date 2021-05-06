package com.helion.dsvendas.dtos;

import java.io.Serializable;

import com.helion.dsvendas.entities.Seller;

public class SellerDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public SellerDTO() {}

	public SellerDTO(Integer id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller entity) {
		
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
