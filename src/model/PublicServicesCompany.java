package model;

/**
 * Class PublicServicesCompany
 * @author Alejandra Diaz
 *
 */

public class PublicServicesCompany extends ServiceCompany implements Tax {
	
	private int totalSubs;
	private int subs12;

	/**
	 * PublicServicesCompany
	 * PublicServicesCompany constructor
	 * Creates a new public services company
	 * <b>post </b> a new public services company is created
	 * @param n name
	 * @param f amount of floors
	 * @param t total subscribers of the company
	 * @param s subscribers from stratum 1 and 2
	 */
	public PublicServicesCompany(String n, int f, int t, int s) {
		super(n, f);
		totalSubs = t;
		subs12 = s;
	}

	/**
	 * 
	 * tax
	 * Calculates the tax that the company has to pay
	 * {@inheritDoc}
	 */
	@Override
	public double tax() {
		double r = ((totalSubs-subs12)/totalSubs)*100;
		double t = 40 - r;
		if(t<0)
			t = 0;
		return t;
	}

	/**
	 * getTotalSubs
	 * getTotalSubs no-argument method returns total subscribers of the company
	 * @return totalSubs
	 */
	public int getTotalSubs() {
		return totalSubs;
	}

	/**
	 * setTotalSubs
	 * changes the amount of subscribers for the new ones entered by parameters
	 * @param totalSubs : new amount of subs
	 */
	public void setTotalSubs(int totalSubs) {
		this.totalSubs = totalSubs;
	}

	/**
	 * getSubs12
	 * getSubs12 no-argument method returns total subscribers from stratum 1 and 2 of the company
	 * @return subs12
	 */
	public int getSubs12() {
		return subs12;
	}

	/**
	 * setSubs12
	 * changes the amount of subscribers from stratum 1 and 2 for the new ones entered by parameters
	 * @param subs12 : new amount of subs
	 */
	public void setSubs12(int subs12) {
		this.subs12 = subs12;
	}


}
