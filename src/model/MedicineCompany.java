package model;
import java.util.ArrayList;

public class MedicineCompany extends FabricationCompany{
	
	private ArrayList<Medicine> arrayMedicine;

	public MedicineCompany(String n) {
		super(n);
		arrayMedicine = new ArrayList<Medicine>();
	}
	
	public ArrayList getArrayMedicine() {
		return arrayMedicine;
	}

}
