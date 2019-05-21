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
	
	public String addCompanyBH(Object c) {}
	
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
