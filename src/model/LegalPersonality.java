package model;
/**
 * Class LegalPersonality
 * @author Alejandra Diaz
 *
 */
public class LegalPersonality {
	
	public static String AG_CAZ_SILV_PESCA = "AGRICULTURA, CAZA, SILVICULTURA Y PESCA";
	public static String EXPLOTATION = "EXPLOTACIÓN DE MINAS Y CANTERAS";
	public static String MANU = "INDUSTRIA MANUFACTURERA";
	public static String ELEC = "ELECTRICIDAD, GAS Y VAPOR";
	public static String CONST = "CONSTRUCCION";
	public static String COMER = "COMERCIO AL POR MAYOR Y AL POR MENOR";
	public static String TRANSP = "TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES";
	public static String VAR = "EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS COMUNALES, SOCIALES";
	
	private String name;
	private int NIT;
	private String dir;
	private int	phone;
	private	int	empCant;
	private	String date;
	private	double actives;
	private	String type;
	private	String legalRep;

	/**
	 * LegalPersonality
	 * LegalPersonality constructor
	 * @param n name
	 * @param ni nit
	 * @param di direction
	 * @param p phone number
	 * @param e employees quantity
	 * @param da date
	 * @param a actives
	 * @param t type
	 * @param l legal representant
	 */
	public LegalPersonality(String n, int ni, String di, int p, int e, String da, double a, String t, String l) {
		name = n;
		NIT = ni;
		dir = di;
		phone = p;
		empCant = e;
		date = da;
		actives = a;
		type = t;
		legalRep = l;
	}

	/**
	 * getNameLP
	 * getNameLP no-argument method returns name of the legal personality
	 * @return name
	 */
	public String getNameLP() {
		return name;
	}

	/**
	 * setNameLP
	 * changes the name of the legal personality for the new one entered by parameters
	 * @param name : new name
	 */
	public void setNameLP(String name) {
		this.name = name;
	}

	/**
	 * getNIT
	 * getNIT no-argument method returns NIT of the legal personality
	 * @return NIT
	 */
	public int getNIT() {
		return NIT;
	}

	/**
	 * setNIT
	 * changes the NIT of the legal personality for the new one entered by parameters
	 * @param nIT : new NIT
	 */
	public void setNIT(int nIT) {
		NIT = nIT;
	}

	/**
	 * getDirLP
	 * getDirLP no-argument method returns direction of the legal personality
	 * @return dir
	 */
	public String getDirLP() {
		return dir;
	}

	/**
	 * setDirLP
	 * changes the direction of the legal personality for the new one entered by parameters
	 * @param dir : new direction
	 */
	public void setDirLP(String dir) {
		this.dir = dir;
	}

	/**
	 * getPhoneLP
	 * getPhoneLP no-argument method returns phone number of the legal personality
	 * @return phone
	 */
	public int getPhoneLP() {
		return phone;
	}

	/**
	 * setPhoneLP
	 * changes the phone number of the legal personality for the new one entered by parameters
	 * @param phone : new phone number
	 */
	public void setPhoneLP(int phone) {
		this.phone = phone;
	}

	/**
	 * getEmpCant
	 * getEmpCant no-argument method returns amount of employees of the legal personality
	 * @return empCant
	 */
	public int getEmpCant() {
		return empCant;
	}

	/**
	 * setEmpCant
	 * changes the amount of employees of the legal personality for the new one entered by parameters
	 * @param empCant : new amount of employees
	 */
	public void setEmpCant(int empCant) {
		this.empCant = empCant;
	}

	/**
	 * getDateLP
	 * getDateLP no-argument method returns date of the legal personality
	 * @return date
	 */
	public String getDateLP() {
		return date;
	}

	/**
	 * setDateLP
	 * changes the date of the legal personality for the new one entered by parameters
	 * @param date : new date
	 */
	public void setDateLP(String date) {
		this.date = date;
	}

	/**
	 * getActives
	 * getActives no-argument method returns actives of the legal personality
	 * @return actives
	 */
	public double getActives() {
		return actives;
	}

	/**
	 * setDateLP
	 * changes the actives of the legal personality for the new one entered by parameters
	 * @param actives : new actives
	 */
	public void setActives(double actives) {
		this.actives = actives;
	}

	/**
	 * getTypeLP
	 * getTypeLP no-argument method returns type of the legal personality
	 * @return type
	 */
	public String getTypeLP() {
		return type;
	}

	/**
	 * setTypeLP
	 * changes the type of the legal personality for the new one entered by parameters
	 * @param type : new type
	 */
	public void setTypeLP(String type) {
		this.type = type;
	}

	/**
	 * getLegalRep
	 * getLegalRep no-argument method returns legal representant of the legal personality
	 * @return legalRep
	 */
	public String getLegalRep() {
		return legalRep;
	}

	/**
	 * setLegalRep
	 * changes the legal representant of the legal personality for the new one entered by parameters
	 * @param legalRep : new legal representant
	 */
	public void setLegalRep(String legalRep) {
		this.legalRep = legalRep;
	}
	
	

}
