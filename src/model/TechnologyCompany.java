package model;

public class TechnologyCompany extends ServiceCompany implements SomethingAndTrees{
	
	private String[] services;
	private int energy;

	public static String CONSULTORY = "Consultoría";
	public static String TRAINING = "Capacitación" ;
	public static String SOFTWARE_M = "Desarrollo de software a la medida";
	public static String INFRASTRUCTURE = "Infraestructura como servicio";
	public static String SOFTWARE_S = "Software como servicio";
	public static String PLATFORM = "Plataforma como servicio";
	
	private String type;
	
	public TechnologyCompany(String n, int f, int e) {
		super(n,f);
		services = new String[50];
		energy = e;
	}
	
	public int somethingXtrees() {
		int x = 0;
		if(energy>=1 && energy<=1000) {
			x = 8;
		}
		else if(energy>1000 && energy<=3000)
			x = 35;
		else if(energy>3000)
			x = 500;
		return x;
	}
	
	public String showServicesList() {
		String msg = CONSULTORY + ", " + TRAINING + ", " + SOFTWARE_M + ", " + INFRASTRUCTURE + ", " + SOFTWARE_S + ", " + PLATFORM;
		return msg;
	}

}
