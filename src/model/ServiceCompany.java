package model;

/**
 * 
 * Class ServiceCompany
 * Superclass that inherits class EducationCompany, PublicServicesCompany and TechnologyCompany
 * @author Alejandra Diaz
 *
 */

public class ServiceCompany extends Company{
	
	private Poll[] arrayPoll;
	

	/**
	 * ServiceCompany
	 * ServiceCompany constructor
	 * Creates a Service Company
	 * <b>post </b> a service company is created. Array of polls is initialized.
	 * @param n name of the company
	 * @param f amount of floors
	 */
	public ServiceCompany(String n, int f) {
		super(n,f);
		arrayPoll = new Poll[50];
	}
	
	/**
	 * getArrayPoll
	 * getArrayPoll no-argument method returns array of polls
	 * @return arrayPoll
	 */
	public Poll[] getArrayPoll() {
		return arrayPoll;
	}
	
	/**
	 * addPoll
	 * Adds a poll to the array of polls
	 * <b>pre </b> array of polls must've been created an initialized
	 * <b>post</b> a new poll is added to the array
	 * @param p poll that's going to be added
	 */
	public void addPoll(Poll p) {
		for(int i = 0;i<arrayPoll.length;i++) {
			if(arrayPoll[i]==null)
				arrayPoll[i]=p;
		}
	}
	
}
