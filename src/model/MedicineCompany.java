package model;
import java.util.ArrayList;

/**
 * 
 * Class MedicineCompany
 * @author Alejandra Diaz
 *
 */
public class MedicineCompany extends FabricationCompany implements SomethingAndTrees{
	
	private ArrayList<Medicine> arrayMedicine;

	/**
	 * MedicineCompany
	 * MedicineCompany constructor
	 * Creates a medicine company
	 * <b>post</b> a medicine company is created
	 * @param n name
	 * @param f amount of floors
	 */
	public MedicineCompany(String n, int f) {
		super(n,f);
		arrayMedicine = new ArrayList<Medicine>();
	}
	
	/**
	 * getTotalWater
	 * calculates the amount of water used by the medicine
	 * <b>pre</b>array of medicines must've been created and initialized
	 * @return amount of water
	 */
	public double getTotalWater() {
		int x = 0;
		for(int i = 0; i<arrayMedicine.size();i++) {
			x += arrayMedicine.get(i).getWater();
		}
		return x;
	}
	
	/**
	 * somethingXtrees
	 * Calculates the amount of trees that the company should plant
	 * @return amount of trees
	 */
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
	
	/**
	 * getArrayMedicine
	 * getArrayMedicine no-argument method returns arraylist of medicines of the company
	 * @return arrayMedicine
	 */
	public ArrayList getArrayMedicine() {
		return arrayMedicine;
	}

}
