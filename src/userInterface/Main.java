package userInterface;
import model.*;
import java.util.Scanner;

public class Main {
	
	private BusinessHolding bh;

	public Main() {
		bh = new BusinessHolding("Test BussinessHolding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String addCompanyM() {
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter the name of the company");
		String n = c.next();
		
		System.out.println("What kind of company is it(E for education, F for food, M for medicine, T for technology)?");
		char x = c.next().charAt(0);
		Object obj = null;
		
		if(x == 'E') {
			System.out.println("Enter the aprobation number of the institution in MEN's register:");
			int rM = c.nextInt();
			System.out.println("Enter the accreditation years of the institution:");
			int ay = c.nextInt();
			System.out.println("Enter the national position in the 'Saber 11' exams of the institution:");
			int np11 = c.nextInt();
			System.out.println("Enter the national position in the 'Saber Pro' exams of the institution:");
			int npp = c.nextInt(); 
			System.out.println("Enter the name of the rector of the institution:");
			String r = c.next();
			System.out.println("Enter the total active students of the institution:");
			int tas = c.nextInt();
			System.out.println("Enter the total active students of stratum 1 or 2 of the institution:");
			int as12 = c.nextInt();
			System.out.println("Enter the education sector of the institution (High school or University):");
			String es = c.next();
			obj = new EducationCompany(n, rM, ay, np11, npp, r, tas, as12, es);
		}
		else if(x == 'T') {
			obj = new TechnologyCompany(n);
		}
		else if(x == 'M') {
			obj = new MedicineCompany(n);
		}
		else if(x == 'F') {
			System.out.println("Enter the sanitary register of the company");
			String sr = c.next();
			obj = new FoodCompany(n,sr);
		}
	}
	
	public String addServicesTechnologyCompany(String j){ //j es el nombre de la company
		Scanner m = new Scanner(System.in);
		System.out.println("Enter the amount of services of the technology company");
		int n = m.nextInt();
		System.out.println("Enter the services of the company");
		TechnologyCompany x = bh.searchTCompanyBH(j);
		String msg = x.showServicesList();
		return msg;
	}


}
