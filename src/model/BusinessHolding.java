package model;
import java.util.ArrayList;

public class BusinessHolding {
	
	private String name;
	
	private ArrayList<Company> arrayCompany;

	public BusinessHolding(String n) {
		name = n;
		arrayCompany = new ArrayList<Company>();
	}
	
	public String addCompany() {
		String msg = "";
		return msg;
	}
	
	public void addCompanyBH(Object c) {
		if(c instanceof EducationCompany)
			arrayCompany.add((TechnologyCompany) c);
		else if(c instanceof Company)
			arrayCompany.add((TechnologyCompany) c);
		else if(c instanceof FoodCompany)
			arrayCompany.add((FoodCompany) c);
		else if(c instanceof MedicineCompany)
			arrayCompany.add((MedicineCompany) c);
	}
	
	public ArrayList getArrayCompany() {
		return arrayCompany;
	}

	public String getNameBH() {
		return name;
	}

	public void setNameBH(String name) {
		this.name = name;
	}
}
