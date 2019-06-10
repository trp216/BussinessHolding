package model;

/**
 * Class Company
 * Superclass that inherits to class ServiceCompany and FabricationCompany
 * @author Alejandra Diaz
 *
 */

public class Company {
	
	private String name;
	private Cubicle[][] matrix;

	/**
	 * Company
	 * Company constructor
	 * Creates a new company
	 * <b>pre:</b> floor must be between 3 and 7. Matrix of cubicles must've been created.
	 * <b>post</b> a new company is created. Matrix is initialized and filled.
	 * @param n name of the company
	 * @param floor amount of floors
	 */
	public Company(String n, int floor) {
		name = n;
		matrix = new Cubicle[floor][20];
		fillMatrix();
	}

	/**
	 * getNameC
	 * getNameC no-argument method returns name of the company
	 * @return name
	 */
	public String getNameC() {
		return name;
	}

	/**
	 * setNameC
	 * changes the name of the company for the new one entered by parameters
	 * @param name : new name
	 */
	public void setNameC(String name) {
		this.name = name;
	}
	
	/**
	 * getMatrix
	 * getMatrix no-argument method returns matrix of cubicles
	 * @return matrix
	 */
	public Cubicle[][] getMatrix(){
		return matrix;
	}
	
	/**
	 * fillMatrix
	 * Method that fills the matrix of cubicles
	 * <b>pre: </b> matrix must've been created an initialized
	 * <b>post:</b> matrix is filled with cubicles
	 */
	public void fillMatrix() {
		int x = 1;
		for(int f = (matrix.length-1); f>=0;f--) {
			for(int j = 0;j<matrix[0].length;j++) {
				matrix[f][j]= new Cubicle(x);
				x++;
			}
		}
	}
	
	/**
	 * searchL
	 * Method that searches an employee extension in a L way
	 * <b>pre: </b> matrix must've been created an initialized
	 * @param n name of the employee
	 * @return extension of the employee
	 */
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
	
	/**
	 * searchO
	 * Method that searches an employee extension in an O way
	 * <b>pre: </b> matrix must've been created an initialized
	 * @param n name of the employee
	 * @return extension of the employee
	 */
	public int searchO(String n) {
		int z = 0;
		for(int c = 0; c<matrix[0].length;c++) {
			if(matrix[0][c]!=null)
				z = matrix[0][c].searchEmployeeExtension(n);
		}
		
		for(int f = 1; f<matrix.length;f++ ) {
			if(matrix[f][0]!=null)
				z = matrix[f][0].searchEmployeeExtension(n);
		}
		
		for(int f = 1; f<matrix.length;f++) {
			if(matrix[f][matrix.length-1]!=null)
			z = matrix[f][matrix.length-1].searchEmployeeExtension(n);
		}
		
		for(int c = 0; c<matrix[0].length;c++) {
			if(matrix[0][c]!=null)
				z = matrix[matrix.length-1][c].searchEmployeeExtension(n);
		}
		return z;
	}
	
	/**
	 * searchO
	 * Method that searches an employee extension in an Z way
	 * <b>pre: </b> matrix must've been created an initialized
	 * @param n name of the employee
	 * @return extension of the employee
	 */
	public int searchZ(String n) {
		int z = 0;
		for(int c = 0; c<matrix[0].length;c++) {
			if(matrix[0][c]!=null)
				z = matrix[0][c].searchEmployeeExtension(n);
		}
		
		for(int f = 1; f<matrix.length-1;f++) {
		for(int i = matrix[0].length-2; i>0;i--) {
			if(f+i==matrix[0].length-1 && matrix[f][i]!=null) {
				z = matrix[f][i].searchEmployeeExtension(n);
		}}}
		
		
		for(int c = 0; c<matrix[0].length;c++) {
			if(matrix[matrix.length-1][c]!=null)
				z = matrix[matrix.length-1][c].searchEmployeeExtension(n);
		}
		return z;
	}
	
	/**
	 * addEmployee
	 * Method that adds a new employee to a cubicle
	 * <b>pre: </b> matrix must've been created an initialized
	 * <b>post: </b> an employee is added to a cubicle
	 * @param e employee that's going to be added
	 */
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
