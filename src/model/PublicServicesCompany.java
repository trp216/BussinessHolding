package model;

public class PublicServicesCompany extends ServiceCompany implements Tax {
	
	private int totalSubs;
	private int subs12;

	public PublicServicesCompany(String n, int f, int t, int s) {
		super(n, f);
		totalSubs = t;
		subs12 = s;
	}

	@Override
	public double tax() {
		double r = ((totalSubs-subs12)/totalSubs)*100;
		double t = 40 - r;
		if(t<0)
			t = 0;
		return t;
	}

	public int getTotalSubs() {
		return totalSubs;
	}

	public void setTotalSubs(int totalSubs) {
		this.totalSubs = totalSubs;
	}

	public int getSubs12() {
		return subs12;
	}

	public void setSubs12(int subs12) {
		this.subs12 = subs12;
	}


}
