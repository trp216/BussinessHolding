package model;

public class Company {
	
	private String name;
	private Cubicle[][] matrix;

	//pre:floor must be between 3 and 7
	public Company(String n, int floor) {
		name = n;
		matrix = new Cubicle[floor][20];
	}

	public String getNameC() {
		return name;
	}

	public void setNameC(String name) {
		this.name = name;
	}
	
	public Cubicle[][] getMatrix(){
		return matrix;
	}
	
	public int searchL(String n) {
		int x = 0;
		int b = matrix.length-1;
		for(int f = 0; f<=b;f++) {
			if(matrix[f][0]!=null)
				x = matrix[f][0].searchEmployeeExtension(n);
		}
		for(int c = 1; c<matrix.length;c++) {
			if(matrix[b][c]!=null)
				x = matrix[b][c].searchEmployeeExtension(n);
		}
		return x;
	}
}
