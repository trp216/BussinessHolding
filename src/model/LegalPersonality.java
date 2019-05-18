package model;

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

	public String getNameLP() {
		return name;
	}

	public void setNameLP(String name) {
		this.name = name;
	}

	public int getNIT() {
		return NIT;
	}

	public void setNIT(int nIT) {
		NIT = nIT;
	}

	public String getDirLP() {
		return dir;
	}

	public void setDirLP(String dir) {
		this.dir = dir;
	}

	public int getPhoneLP() {
		return phone;
	}

	public void setPhoneLP(int phone) {
		this.phone = phone;
	}

	public int getEmpCant() {
		return empCant;
	}

	public void setEmpCant(int empCant) {
		this.empCant = empCant;
	}

	public String getDateLP() {
		return date;
	}

	public void setDateLP(String date) {
		this.date = date;
	}

	public double getActives() {
		return actives;
	}

	public void setActives(double actives) {
		this.actives = actives;
	}

	public String getTypeLP() {
		return type;
	}

	public void setTypeLP(String type) {
		this.type = type;
	}

	public String getLegalRep() {
		return legalRep;
	}

	public void setLegalRep(String legalRep) {
		this.legalRep = legalRep;
	}
	
	

}
