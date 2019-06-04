package model;
import java.util.ArrayList;

public class MedicineCompany extends FabricationCompany implements SomethingAndTrees{
	
	private ArrayList<Medicine> arrayMedicine;

	public MedicineCompany(String n, int f) {
		super(n,f);
		arrayMedicine = new ArrayList<Medicine>();
	}
	
	public double getTotalWater() {
		int x = 0;
		for(int i = 0; i<arrayMedicine.size();i++) {
			x += arrayMedicine.get(i).getWater();
		}
		return x;
	}
	
	public int somethingXtrees() {
		int t = 0;
		if(getTotalWater()>=1 && getTotalWater()<=140)
			t = 6;
		if(getTotalWater()>140 && getTotalWater()<=800)
			t = 25;
		if(getTotalWater()>800)
			t = 200;
		return t;
	}
	
	public ArrayList getArrayMedicine() {
		return arrayMedicine;
	}

}
