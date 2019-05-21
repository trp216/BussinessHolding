package model;

public class Product {

	private String name;
	private int code;
	private double water;
	private int inventary;
	
	public Product(String n, int c, double w, int i) {
		name = n;
		code = c;
		water = w;
		inventary = i;
	}

	public String getNameP() {
		return name;
	}

	public void setNameP(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public int getInventary() {
		return inventary;
	}

	public void setInventary(int inventary) {
		this.inventary = inventary;
	}

	
	
}
