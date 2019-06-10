package model;

/**
 * Class EducationCompany
 * @author Alejandra Diaz
 *
 */

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
	
	/**
	 * EducationCompany()
	 * EducationCompany constructor
	 * Creates an object EducationCompany
	 * <b>post:</b> an education company is created
	 * @param n name
	 * @param f amount of floors
	 * @param rm MEN register
	 * @param ay accreditation years
	 * @param ne national position on saber11 exams
	 * @param np national position on saber pro exams
	 * @param re name of the rector
	 * @param t total amount of active students
	 * @param as amount of active students of stratum 1 and 2
	 * @param e education sector
	 */
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
	
	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public double tax() {

		double p = activeStudents12/totalActiveStudents;
		double t = 20 - p;
		if(p<0)
			t = 0;
		return t;
	}

	/**
	 * getRegistroMEN
	 * getRegistroMEN no-argument method returns MEN register of the company
	 * @return registroMEN
	 */
	public int getRegistroMEN() {
		return registroMEN;
	}

	/**
	 * setRegistroMEN
	 * changes the MEN's register of the company for the new one entered by parameters
	 * @param registroMEN : new MEN's register
	 */
	public void setRegistroMEN(int registroMEN) {
		this.registroMEN = registroMEN;
	}

	/**
	 * getAccreditationYears
	 * getAccreditationYears no-argument method returns accreditation years of the company
	 * @return accreditationYears
	 */
	public int getAccreditationYears() {
		return accreditationYears;
	}

	/**
	 * setAccreditationYears
	 * changes the accreditation years of the company for the new ones entered by parameters
	 * @param accreditationYears : new accreditation years
	 */
	public void setAccreditationYears(int accreditationYears) {
		this.accreditationYears = accreditationYears;
	}

	/**
	 * getNationalPosition11
	 * nationalPosition11 no-argument method returns national position on saber11 exams of the company
	 * @return nationalPosition11
	 */
	public int getNationalPosition11() {
		return nationalPosition11;
	}

	/**
	 * setNationalPosition11
	 * changes the national position on saber11 exams of the company for the new one entered by parameters
	 * @param nationalPosition11 : new position
	 */
	public void setNationalPosition11(int nationalPosition11) {
		this.nationalPosition11 = nationalPosition11;
	}

	/**
	 * getNationalPositionPro
	 * getNationalPositionPro no-argument method returns national position on saber pro exams of the company
	 * @return nationalPositionPro
	 */
	public int getNationalPositionPro() {
		return nationalPositionPro;
	}

	/**
	 * setNationalPositionPro
	 * changes the national position on saber pro exams of the company for the new one entered by parameters
	 * @param nationalPositionPro : new position
	 */
	public void setNationalPositionPro(int nationalPositionPro) {
		this.nationalPositionPro = nationalPositionPro;
	}

	/**
	 * getRector
	 * getRector no-argument method returns name of the rector of the company
	 * @return rector
	 */
	public String getRector() {
		return rector;
	}

	/**
	 * setRector
	 * changes the name of the rector of the company for the new one entered by parameters
	 * @param rector : new name 
	 */
	public void setRector(String rector) {
		this.rector = rector;
	}

	/**
	 * getTotalActiveStudents
	 * getTotalActiveStudents no-argument method returns total amount of active students of the company
	 * @return totalActiveStudents
	 */
	public int getTotalActiveStudents() {
		return totalActiveStudents;
	}

	/**
	 * setTotalActiveStudents
	 * changes the total amount of active students of the company for the new one entered by parameters
	 * @param totalActiveStudents : new amount of students
	 */
	public void setTotalActiveStudents(int totalActiveStudents) {
		this.totalActiveStudents = totalActiveStudents;
	}

	/**
	 * getActiveStudents12
	 * getActiveStudents12 no-argument method returns total amount of active students from stratum 1 and 2 of the company
	 * @return activeStudents12
	 */
	public int getActiveStudents12() {
		return activeStudents12;
	}

	/**
	 * setActiveStudents12
	 * changes the total amount of active students from stratum 1 and 2 of the company for the new one entered by parameters
	 * @param activeStudents12 : new amount of students
	 */
	public void setActiveStudents12(int activeStudents12) {
		this.activeStudents12 = activeStudents12;
	}

	/**
	 * getEducationSector
	 * getEducationSector no-argument method returns the education sector of the company
	 * @return educationSector
	 */
	public String getEducationSector() {
		return educationSector;
	}

	/**
	 * setEducationSector
	 * changes the education sector of the company for the new one entered by parameters
	 * @param educationSector : new education sector
	 */
	public void setEducationSector(String educationSector) {
		this.educationSector = educationSector;
	}
	
}
