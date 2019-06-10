package model;
import java.util.ArrayList;

/**
 * BusinessHolding
 * @author Alejandra Diaz
 *
 */
public class BusinessHolding {
	
	private String name;
	
	private ArrayList<Company> arrayCompany;
	private Question testQ;
	
	/**
	 * BusinessHolding
	 * BusinessHolding constructor
	 * Creates a bussiness holding
	 * <b>post</b> a bussiness holding is created. The arraylist of companies is initialized
	 * @param n name
	 */
	public BusinessHolding(String n) {
		name = n;
		arrayCompany = new ArrayList<Company>();
	}
	
	/* 
	 * getTestQ
	 * getIDCH no-argument method returns test object question
	 * @return testQ
	 */
	public Question getTestQ() {
		return testQ;
	}
	
	/**
	 * registerPollBH
	 * This method registers a new poll in a service company
	 * <b>pre</b> arraylist of companies must've been created and initialized
	 * <b>post</b> a new poll is added.
	 * @param n name of the company
	 * @param a1 answer 1
	 * @param a2 answer 2
	 * @param a3 answer 3
	 */
	public void registerPollBH(String n, int a1, int a2, int a3) {
		if(searchCompanyBH(n)!=null && searchCompanyBH(n) instanceof ServiceCompany) {
			ServiceCompany s = (ServiceCompany)searchCompanyBH(n);
			Poll p = new Poll(a1,a2,a3);
			s.addPoll(p);
		}
	}
	
	/**
	 * addCompanyBH
	 * This method registers a new company 
	 * <b>pre</b> arraylist of companies must've been created and initialized
	 * <b>post</b> a new company is added.
	 * @param c company that's going to be added
	 */
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
	
	/**
	 * searchCompanyBH
	 * This method searches a company
	 * <b>pre</b> arraylist of companies must've been created and initialized
	 * @param n name of the company
	 * @return company
	 */
	public Company searchCompanyBH(String n) {
		Company obj = null;
		for(int i=0;i<arrayCompany.size();i++) {
			if(arrayCompany.get(i).getNameC().equals(n))
				obj = arrayCompany.get(i);
		}
		return obj;
	}
	
	/**
	 * searchTCompanyBH
	 * This method searches a technology company
	 * <b>pre</b> arraylist of companies must've been created and initialized
	 * @param n name of the company
	 * @return technology company
	 */
	public TechnologyCompany searchTCompanyBH(String n) {
		TechnologyCompany obj = null;
		for(int i=0;i<arrayCompany.size();i++) {
			if(arrayCompany.get(i) instanceof TechnologyCompany && arrayCompany.get(i).getNameC().equals(n))
				obj = (TechnologyCompany) arrayCompany.get(i);
		}
		return obj;
	}
	
	/**
	 * searchEmployeeBH
	 * This method searches an employee's telephone extension
	 * <b>pre</b> arraylist of companies must've been created and initialized
	 * @param c name of the company
	 * @param n name of the employee
	 * @param b way of search
	 * @return telephone extension
	 */
	public int searchEmployeeBH(String c, String n, char b) {
		int y = 0;
		if(searchCompanyBH(c)!=null) {
			if(b == 'L')	
				y = searchCompanyBH(c).searchL(n);
			if(b == 'O')	
				y = searchCompanyBH(c).searchO(n);
			if(b =='Z')
				y = searchCompanyBH(c).searchZ(n);
		}
		return y;
	}
	
	/**
	 * addEmployeeBH
	 * This method registers a new employee 
	 * <b>pre</b> arraylist of companies must've been created and initialized
	 * <b>post</b> a new employee is added.
	 * @param n name of the employee
	 * @param p position of the employee
	 * @param m email of the employee
	 * @param c name of the company
	 */
	public void addEmployeeBH(String n, String p, String m, String c) {
		Employee e = new Employee(n,p,m);
		if(searchCompanyBH(c)!=null)
			searchCompanyBH(c).addEmployee(e);
	}
	
	/**
	 * getArrayCompany
	 * getArrayCompany no-argument method returns arraylist of companies
	 * @return arrayCompany
	 */
	public ArrayList getArrayCompany() {
		return arrayCompany;
	}

	/**
	 * getNameBH
	 * getNameBH no-argument method returns name of the bussiness holding
	 * @return name
	 */
	public String getNameBH() {
		return name;
	}

	/**
	 * setNameBH
	 * changes the name of the bussiness holding for the new one entered by parameters
	 * @param name : new name
	 */
	public void setNameBH(String name) {
		this.name = name;
	}
	
}
