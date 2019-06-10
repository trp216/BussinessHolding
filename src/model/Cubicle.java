package model;

/**
 * Class Cubicle
 * @author Alejandra Diaz
 *
 */
public class Cubicle {
	
	private int telephoneExtension;
	private Employee employeeX;
	
	/**
	 * Cubicle
	 * Cubicle constructor
	 * Creates a cubicle
	 * <b>post</b> a cubicle is created. If an employee is associated to the cubicle, the telephone extension of the cubicle is assigned to the employee
	 * @param t telephone extension
	 */
	public Cubicle(int t) {
		telephoneExtension = t;
		if(employeeX!=null)
			employeeX.setTelephoneExtension(telephoneExtension);
	}
	
	public Employee getEmployeeX() {
		return employeeX;
	}

	/**
	 * setEmployeeX
	 * changes the employee of the cubicle for the new one entered by parameters
	 * @param employeeX : new employee
	 */
	public void setEmployeeX(Employee employeeX) {
		this.employeeX = employeeX;
	}

	/**
	 * getTelephoneExtension
	 * getTelephoneExtension no-argument method returns the telephone extension of the cubicle
	 * @return telephoneExtension
	 */
	public int getTelephoneExtension() {
		return telephoneExtension;
	}

	/**
	 * setTelephoneExtension
	 * changes the telephone extension of the cubicle for the new one entered by parameters
	 * @param telephoneExtension : new telephone extension
	 */
	public void setTelephoneExtension(int telephoneExtension) {
		this.telephoneExtension = telephoneExtension;
	}

	/**
	 * searchEmployeeExtension
	 * This method searches the employee extension
	 * @param n name of the employee
	 * @return telephone extension
	 */
	public int searchEmployeeExtension(String n) {
		int w = 0;
		if(employeeX != null) {
			w = telephoneExtension;
		}
		return w;
	}

}
