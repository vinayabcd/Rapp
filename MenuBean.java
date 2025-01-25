package com.pack1;

import java.io.Serializable;

public class MenuBean implements Serializable
{
	private int id;
    private String name;
    private String category;
    private double price;
    
//	public MenuBean(int id, String name, String category, double price) {
//		this.id = id;
//		this.name = name;
//		this.category = category;
//		this.price = price;
//	}
//	public MenuBean() {
//		// TODO Auto-generated constructor stub
//	}
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
    
    
    

}
