package model;

public class EducationCompany extends ServiceCompany implements Tax{

	private int registroMEN;
	private int accreditationYears;
	private int nationalPosition11;
	private int nationalPositionPro; 
	private String rector;
	private int totalActiveStudents;
	private int activeStudents12;
	private String educationSector;
	
	public static String HS = "High School"; 
	public static String UN = "University";
	
	public EducationCompany(String n, int f,int rm, int ay, int ne, int np, String re, int t, int as, String e) {
		super(n,f);
		registroMEN = rm;
		accreditationYears = ay;
		nationalPosition11 = ne;
		nationalPositionPro = np;
		rector = re;
		totalActiveStudents = t;
		activeStudents12 = as;
		educationSector = e;
	}
	
	public double tax() {
		double p = activeStudents12/totalActiveStudents;
		double t = 20 - p;
		if(p<0)
			t = 0;
		return t;
	}

	public int getRegistroMEN() {
		return registroMEN;
	}

	public void setRegistroMEN(int registroMEN) {
		this.registroMEN = registroMEN;
	}

	public int getAccreditationYears() {
		return accreditationYears;
	}

	public void setAccreditationYears(int accreditationYears) {
		this.accreditationYears = accreditationYears;
	}

	public int getNationalPosition11() {
		return nationalPosition11;
	}

	public void setNationalPosition11(int nationalPosition11) {
		this.nationalPosition11 = nationalPosition11;
	}

	public int getNationalPositionPro() {
		return nationalPositionPro;
	}

	public void setNationalPositionPro(int nationalPositionPro) {
		this.nationalPositionPro = nationalPositionPro;
	}

	public String getRector() {
		return rector;
	}

	public void setRector(String rector) {
		this.rector = rector;
	}

	public int getTotalActiveStudents() {
		return totalActiveStudents;
	}

	public void setTotalActiveStudents(int totalActiveStudents) {
		this.totalActiveStudents = totalActiveStudents;
	}

	public int getActiveStudents12() {
		return activeStudents12;
	}

	public void setActiveStudents12(int activeStudents12) {
		this.activeStudents12 = activeStudents12;
	}

	public String getEducationSector() {
		return educationSector;
	}

	public void setEducationSector(String educationSector) {
		this.educationSector = educationSector;
	}
	
}
