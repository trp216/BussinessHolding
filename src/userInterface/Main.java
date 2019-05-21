package userInterface;
import model.*;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
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
			EducationCompany e = new EducationCompany(n, rM, ay, np11, npp, r, tas, as12, es);
			obj = e;
		}
		else if(x == 'T') {
			
		}
	}

}
