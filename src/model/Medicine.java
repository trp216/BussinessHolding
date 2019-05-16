package model;

public class Medicine extends Product{
	
	public static String VALID = "Valid";
	public static String NOT_RENEWED = "Not renewed";
	public static String F_E = "Manufacture and export";
	public static String F_S = "Manufacture and sell";
	public static String I_S = "Import and sell";
	private String sanReg;
	private String state;
	private String expiration;
	private String modality;

	public Medicine(String n, int c, double w, int i, String sr, String st, String e, String m) {
		super(n,c,w,i);
		sanReg = sr;
		state = st;
		expiration = e;
		modality = m;
	}

	public String getSanReg() {
		return sanReg;
	}

	public void setSanReg(String sanReg) {
		this.sanReg = sanReg;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

}
