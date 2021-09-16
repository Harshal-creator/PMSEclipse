package com.pms.entity;

public class Product {

	String name;
	int pid;
	String pcompany;
	float price;
	public Product(String name, int pid, String pcompany, float price) {
		super();
		this.name = name;
		this.pid = pid;
		this.pcompany = pcompany;
		this.price = price;
	}
	public Product() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcompany() {
		return pcompany;
	}
	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
