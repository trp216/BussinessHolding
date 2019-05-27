package model;

public class FoodCompany extends FabricationCompany{
	
	private String sanReg;

	public FoodCompany(String n, String sr) {
		super(n);
		sanReg = sr;
	}

	public String getSanReg() {
		return sanReg;
	}

	public void setSanReg(String sanReg) {
		this.sanReg = sanReg;
	}

	
}
