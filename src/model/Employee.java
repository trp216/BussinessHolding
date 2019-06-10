package model;

/**
 * 
 * Class Employee
 * @author Alejandra Diaz
 *
 */

public class Employee{
	
	private String name;
	private String position;
	private String email;
	private int telephoneExtension;

	/**
	 * Employee()
	 * Employee constructor
	 * Creates an object employee
	 * <b>post:</b> an employee is created
	 * @param n name 
	 * @param p position
	 * @param e email
	 */
	public Employee(String n, String p, String e) {
		name = n;
		position = p;
		email = e;
	}

	/**
	 * getTelephoneExtension
	 * getTelephoneExtension no-argument method returns telephone extension
	 * @return telephoneExtension
	 */
	public int getTelephoneExtension() {
		return telephoneExtension;
	}

	/**
	 * setTelephoneExtension
	 * changes the telephone extension of the employee for the new one entered by parameters
	 * @param telephoneExtension : new telephone extension
	 */
	public void setTelephoneExtension(int telephoneExtension) {
		this.telephoneExtension = telephoneExtension;
	}

	/**
	 * getNameE
	 * getNameE no-argument method returns name of the employee
	 * @return name
	 */
	public String getNameE() {
		return name;
	}

	/**
	 * setNameE
	 * changes the name of the employee for the new one entered by parameters
	 * @param name : new name
	 */
	public void setNameE(String name) {
		this.name = name;
	}

	/**
	 * getPosition
	 * getPosition no-argument method returns position of the employee
	 * @return position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * setPosition
	 * changes the position of the employee for the new one entered by parameters
	 * @param position : new position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * getEmail
	 * getEmail no-argument method returns email of the employee
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * setEmail
	 * changes the email of the employee for the new one entered by parameters
	 * @param email : new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	

}
