package model;

public class TechnologyCompany extends ServiceCompany{
	
	private String[] services;

	public static String CONSULTORY = "Consultoría";
	public static String TRAINING = "Capacitación" ;
	public static String SOFTWARE_M = "Desarrollo de software a la medida";
	public static String INFRASTRUCTURE = "Infraestructura como servicio";
	public static String SOFTWARE_S = "Software como servicio";
	public static String PLATFORM = "Plataforma como servicio";
	
	private String type;
	
	public TechnologyCompany(String n) {
		super(n);
		services = new String[50];
	}
	
	
	public String showServicesList() {
		String msg = CONSULTORY + ", " + TRAINING + ", " + SOFTWARE_M + ", " + INFRASTRUCTURE + ", " + SOFTWARE_S + ", " + PLATFORM;
		return msg;
	}

}
