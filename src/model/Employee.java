package model;

public class Employee{
	
	private String name;
	private String position;
	private String email;
	private int telephoneExtension;

	public Employee(String n, String p, String e) {
		name = n;
		position = p;
		email = e;
	}

	public int getTelephoneExtension() {
		return telephoneExtension;
	}

	public void setTelephoneExtension(int telephoneExtension) {
		this.telephoneExtension = telephoneExtension;
	}

	public String getNameE() {
		return name;
	}

	public void setNameE(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
