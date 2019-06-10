package model;

/**
 * Class Poll
 * @author Alejandra Diaz
 *
 */
public class Poll {


	private int a1;
	private int a2;
	private int a3;
	
	/**
	 * Poll
	 * Poll constructor
	 * Ccreates a new poll
	 * <b>post</b> a new poll is created
	 * @param o answer one
	 * @param tw answer two
	 * @param th answer three
	 */
	public Poll(int o, int tw, int th) {
		a1 = o;
		a2 = tw; 
		a3 = th;
	}

	/**
	 * getA1
	 * getA1 no-argument method returns answer one of the poll
	 * @return a1
	 */
	public int getA1() {
		return a1;
	}

	/**
	 * setA1
	 * changes the answer for the new one entered by parameters
	 * @param a1 : new answer
	 */
	public void setA1(int a1) {
		this.a1 = a1;
	}

	/**
	 * getA2
	 * getA2 no-argument method returns answer two of the poll
	 * @return a2
	 */
	public int getA2() {
		return a2;
	}

	/**
	 * setA2
	 * changes the answer for the new one entered by parameters
	 * @param a2 : new answer
	 */
	public void setA2(int a2) {
		this.a2 = a2;
	}

	/**
	 * getA3
	 * getA3 no-argument method returns answer three of the poll
	 * @return a3
	 */
	public int getA3() {
		return a3;
	}

	/**
	 * setA2
	 * changes the answer for the new one entered by parameters
	 * @param a3 : new answer
	 */
	public void setA3(int a3) {
		this.a3 = a3;
	}

	
}
