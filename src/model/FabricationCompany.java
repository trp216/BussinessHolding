package model;

/**
 * Class FabricationCompany
 * Superclass that inherits to FoodCompany and MedicineCompany
 * @author Alejandra Diaz
 *
 */
public class FabricationCompany extends Company{
	
	private Product product;

	/**
	 * FabricationCompany
	 * FabricationCompany constructor
	 * Creates a fabrication company
	 * <b>post</b> a fabrication company is created
	 * @param n name
	 * @param f amount of floors
	 */
	public FabricationCompany(String n, int f) {
		super(n, f);
	
	}

}
