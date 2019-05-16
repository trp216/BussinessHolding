package model;

public class Product {

	protected String name;
	protected int code;
	protected double water;
	private int inventary;
	
	public Product(String n, int c, double w, int i) {
		name = n;
		code = c;
		water = w;
		inventary = i;
	}

}
