package model;

/**
 * 
 * Class TechnologyCompany
 * @author Alejandra Diaz
 *
 */

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
	
	/**
	 * TechnologyCompany
	 * TechnologyCompany constructor
	 * Creates a TechnologyCompany
	 * <b>post: </b> a new technology company is created. Array of services is created.
	 * @param n name of the company
	 * @param f amount of floors
	 * @param e energy that the company uses
	 */
	public TechnologyCompany(String n, int f, int e) {
		super(n,f);
		services = new String[50];
		energy = e;
	}
	
	/**
	 * somethingXtrees
	 * Calculates the trees that the company should plant for its use of energy
	 * {@inheritDoc}
	 * @return number of trees
	 */
	@Override
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
	
	/**
	 * showServicesList
	 * Shows a list of the services
	 * @return message showing the different types of services
	 */
	public String showServicesList() {
		String msg = CONSULTORY + ", " + TRAINING + ", " + SOFTWARE_M + ", " + INFRASTRUCTURE + ", " + SOFTWARE_S + ", " + PLATFORM;
		return msg;
	}
	
	/**
	 * getArrayServices
	 * getArrayServices no-argument method returns array of services
	 * @return services
	 */
	public String[] getArrayServices() {
		return services;
	}

}
