

package model;

public class Poll {

	private int a1;
	private int a2;
	private int a3;
	
	public Poll(int o, int tw, int th) {
		a1 = o;
		a2 = tw; 
		a3 = th;
	}

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public int getA2() {
		return a2;
	}

	public void setA2(int a2) {
		this.a2 = a2;
	}

	public int getA3() {
		return a3;
	}

	public void setA3(int a3) {
		this.a3 = a3;
	}

	
}
