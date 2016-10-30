package com.org.entity;

/**
 * 商品的实体类
 * 
 * @author kf0101
 * 
 */
public class Product {
	private int id;
	private String name;
	private Double price;

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}