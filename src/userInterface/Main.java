package userInterface;
import model.*;
import java.util.Scanner;

public class Main {
	
	private BusinessHolding bh;

	public Main() {
		bh = new BusinessHolding("Test BussinessHolding");
	}

	public static void main(String[] args) {
		Main objMain = new Main();
		System.out.println("Welcome to the Bussiness Holding menu");
		objMain.menu();
	}
	
	public void menu() {
		Scanner x = new Scanner(System.in);
		boolean end = true;
		String msg = "";
		while(end) {
			System.out.println("What do you want to do?\n");
			System.out.println("1- Add a company\n");
			System.out.println("2- Register a new poll\n");
			System.out.println("3- Search for an employee extension");
			System.out.println("4- Add an employee");
			System.out.println("5- Exit");
			int entry = x.nextInt();
			switch(entry){
				case 1:
					addCompanyM();
					break;
				case 2:
					registerPoll();
					break;
				case 3:
					msg = Integer.toString(searchEmployee());
					System.out.println(msg);
					break;
				case 5:
					msg = "gweld chi yn fuan"; 
					System.out.println(msg);
					end = false;
					break;
				default:
					msg = "Error: this number can't be evaluated";
					System.out.println(msg);
			}
		}
		
	}
	
	public void addCompanyM() {
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter the name of the company");
		String n = c.next();
		
		System.out.println("Enter the amount of floors of the company");
		int f = c.nextInt();
		
		System.out.println("What kind of company is it(E for education, F for food, M for medicine, T for technology, P for Public Services)?");
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
			obj = new EducationCompany(n,f, rM, ay, np11, npp, r, tas, as12, es);
		}
		else if(x == 'T') {
			System.out.println("How much energy does it consume?");
			int e = c.nextInt();
			obj = new TechnologyCompany(n,f,e);
		}
		else if(x == 'M') {
			obj = new MedicineCompany(n,f);
		}
		else if(x == 'F') {
			System.out.println("Enter the sanitary register of the company");
			String sr = c.next();
			obj = new FoodCompany(n,f, sr);
		}
		else if(x == 'P') {
			System.out.println("Enter the total subscribers of the company:");
			int t = c.nextInt();
			System.out.println("Enter the amount of subscribers from stratum 1 and 2");
			int s = c.nextInt();
			obj = new PublicServicesCompany(n, f, t ,s);
		}
		
		if(bh.searchCompanyBH(n)==null)
			bh.addCompanyBH(obj);
	}
	
	public void registerPoll() {
		Scanner p = new Scanner(System.in);
		
		System.out.println("Enter the name of the company:");
		String n = p.next();
		System.out.println(bh.getTestQ().getQ1());
		int a1 = p.nextInt();
		System.out.println(bh.getTestQ().getQ2());
		int a2 = p.nextInt();
		System.out.println(bh.getTestQ().getQ3());
		int a3 = p.nextInt();
			
		bh.registerPollBH(n, a1, a2, a3);
	}
	
	public int searchEmployee() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name of the company");
		String c = s.next();
		
		System.out.println("Enter the name of the employee that you want to search:");
		String n = s.next();
		
		System.out.println("Enter the way of searching (L, O)");
		char b = s.next().charAt(0);
		
		return bh.searchEmployeeBH(c, n, b);
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
