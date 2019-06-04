package model;
import java.util.ArrayList;

public class BusinessHolding {
	
	private String name;
	
	private ArrayList<Company> arrayCompany;
	private Question testQ;
	
	public BusinessHolding(String n) {
		name = n;
		arrayCompany = new ArrayList<Company>();
	}
	
	public Question getTestQ() {
		return testQ;
	}
	
	public void registerPollBH(String n, int a1, int a2, int a3) {
		if(searchCompanyBH(n) instanceof ServiceCompany) {
			ServiceCompany s = (ServiceCompany)searchCompanyBH(n);
			Poll p = new Poll(a1,a2,a3);
			s.addPoll(p);
		}
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
	
	public Company searchCompanyBH(String n) {
		Company obj = null;
		for(int i=0;i<arrayCompany.size();i++) {
			if(arrayCompany.get(i).getNameC().equals(n))
				obj = arrayCompany.get(i);
		}
		return obj;
	}
	
	public TechnologyCompany searchTCompanyBH(String n) {
		TechnologyCompany obj = null;
		for(int i=0;i<arrayCompany.size();i++) {
			if(arrayCompany.get(i) instanceof TechnologyCompany && arrayCompany.get(i).getNameC().equals(n))
				obj = (TechnologyCompany) arrayCompany.get(i);
		}
		return obj;
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
