package model;

/**
 * Class Product
 * Superclass that inherits to class Medicine
 * @author Alejandra Diaz
 *
 */
public class Product {

	private String name;
	private int code;
	private double water;
	private int inventary;
	
	/**
	 * Product
	 * Product constructor
	 * Creates a new product
	 * <b>post</b> a new product is created
	 * @param n name
	 * @param c code
	 * @param w water used to make it
	 * @param i inventary
	 */
	public Product(String n, int c, double w, int i) {
		name = n;
		code = c;
		water = w;
		inventary = i;
	}

	/**
	 * getNameP
	 * getNameP no-argument method returns name of the product
	 * @return name
	 */
	public String getNameP() {
		return name;
	}

	/**
	 * setNameP
	 * changes the name of the product for the new one entered by parameters
	 * @param name : new name
	 */
	public void setNameP(String name) {
		this.name = name;
	}

	/**
	 * getCode
	 * getCode no-argument method returns code of the product
	 * @return code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * setCode
	 * changes the code of the product for the new one entered by parameters
	 * @param code : new code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * getWater
	 * getWater no-argument method returns water used to make product
	 * @return water
	 */
	public double getWater() {
		return water;
	}

	/**
	 * setWater
	 * changes the water of the product for the new one entered by parameters
	 * @param water : new water
	 */
	public void setWater(double water) {
		this.water = water;
	}

	/**
	 * getInventary
	 * getInventary no-argument method returns inventary of the product
	 * @return inventary
	 */
	public int getInventary() {
		return inventary;
	}

	/**
	 * setInventary
	 * changes the inventary of the product for the new one entered by parameters
	 * @param inventary : new inventary
	 */
	public void setInventary(int inventary) {
		this.inventary = inventary;
	}

	
	
}
