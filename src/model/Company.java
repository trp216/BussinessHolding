package model;

public class Company {
	
	private String name;
	private Cubicle[][] matrix;

	//pre:floor must be between 3 and 7
	public Company(String n, int floor) {
		name = n;
		matrix = new Cubicle[floor][20];
		fillMatrix();
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
	
	public void fillMatrix() {
		int x = 1;
		for(int f = (matrix.length-1); f>=0;f--) {
			for(int j = 0;j<matrix[0].length;j++) {
				matrix[f][j]= new Cubicle(x);
			x++;
		}
		}
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
	
	public int searchO(String n) {
		int z = 0;
		for(int c = 0; c<matrix.length;c++) {
			if(matrix[0][c]!=null)
				z = matrix[0][c].searchEmployeeExtension(n);
		}
		
		for(int c = 0; c<matrix.length;c++) {
			if(matrix[0][c]!=null)
				z = matrix[matrix.length-1][c].searchEmployeeExtension(n);
		}
		return z;
	}
	
	public void addEmployee(Employee e) {
		boolean b = false;
		for(int f = 0; f<matrix.length-1 && b==false;f--) {
			for(int c = 0; c<matrix[0].length && b==false;c++) {
				if(matrix[f][c]==null) {
					matrix[f][c].setEmployeeX(e);
					e.setTelephoneExtension(matrix[f][c].getTelephoneExtension());
					b = true;
				}
			}
		}
	}
}
