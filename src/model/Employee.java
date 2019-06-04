package model;

public class Employee extends Cubicle{
	
	private String name;
	private String position;
	private String email;

	public Employee(int t, String n, String p, String e) {
		super(t);
		name = n;
		position = p;
		email = e;
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
