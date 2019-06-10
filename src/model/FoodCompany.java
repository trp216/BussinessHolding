package model;

/**
 * FoodCompany
 * @author Alejandra Diaz
 *
 */
public class FoodCompany extends FabricationCompany{
	
	private String sanReg;

	/**
	 * FoodCompany
	 * FoodCompany constructor
	 * Creates a food company
	 * <b>post </b> a food company is created 
	 * @param n name
	 * @param f amount of floors
	 * @param sr sanitary register
	 */
	public FoodCompany(String n, int f,String sr) {
		super(n,f);
		sanReg = sr;
	}

	public String getSanReg() {
		return sanReg;
	}

	/**
	 * setSanReg
	 * changes the sanitary register of the company for the new one entered by parameters
	 * @param sanReg : new sanitary register
	 */
	public void setSanReg(String sanReg) {
		this.sanReg = sanReg;
	}

	
}
