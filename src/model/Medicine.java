package model;

/**
 * Class Medicine
 * @author Alejandra Diaz
 *
 */

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

	/**
	 * Medicine
	 * Medicine constructor
	 * Creates a medicine
	 * <b>post</b> a medicine is created
	 * @param n name
	 * @param c code
	 * @param w water
	 * @param i inventary
	 * @param sr sanitary register
	 * @param st state
	 * @param e expiration date
	 * @param m modality
	 */
	public Medicine(String n, int c, double w, int i, String sr, String st, String e, String m) {
		super(n,c,w,i);
		sanReg = sr;
		state = st;
		expiration = e;
		modality = m;
	}
	
	/**
	 * getSanReg
	 * getSanReg no-argument method returns sanitary register of the medicine
	 * @return sanReg
	 */
	public String getSanReg() {
		return sanReg;
	}

	/**
	 * setSanReg
	 * changes the sanitary register of the medicine for the new one entered by parameters
	 * @param sanReg : new sanitary register
	 */
	public void setSanReg(String sanReg) {
		this.sanReg = sanReg;
	}

	/**
	 * getState
	 * getState no-argument method returns state of the medicine
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * setState
	 * changes the state of the medicine for the new one entered by parameters
	 * @param state : new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * getExpiration
	 * getExpiration no-argument method returns expiration of the medicine
	 * @return expiration
	 */
	public String getExpiration() {
		return expiration;
	}

	/**
	 * setExpiration
	 * changes the expiration of the medicine for the new one entered by parameters
	 * @param expiration : new expiration
	 */
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	/**
	 * getModality
	 * getModality no-argument method returns modality of the medicine
	 * @return modality
	 */
	public String getModality() {
		return modality;
	}

	/**
	 * setModality
	 * changes the modality of the medicine for the new one entered by parameters
	 * @param modality : new modality
	 */
	public void setModality(String modality) {
		this.modality = modality;
	}

}
