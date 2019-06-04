package model;

public class Cubicle {
	
	private int telephoneExtension;
	private Employee employeeX;
	
	public Cubicle(int t) {
		telephoneExtension = t;
	}
	
	public Employee getEmployeeX() {
		return employeeX;
	}

	public void setEmployeeX(Employee employeeX) {
		this.employeeX = employeeX;
	}

	public int getTelephoneExtension() {
		return telephoneExtension;
	}

	public void setTelephoneExtension(int telephoneExtension) {
		this.telephoneExtension = telephoneExtension;
	}

	public int searchEmployeeExtension(String n) {
		int w = 0;
		if(employeeX != null) {
			w = employeeX.getTelephoneExtension();
		}
		return w;
	}

}
