package model;

/**
 * Class Question
 * @author Alejandra Diaz
 *
 */
public class Question {
	
	private String q1;
	private String q2;
	private String q3;
	
	/**
	 * Question
	 * Question constructor
	 * Creates an object question
	 * <b>post</b> an object question is created. q1,q2 and q3 are initialized
	 */
	public Question() {
		q1 = "How satisfied are you with the service provided?";
		q2 = "How satisfied are you with the response time?";
		q3 = "How satisfied are you with the cost/benefit ratio of the service purchased?";
	}

	/**
	 * getQ1
	 * getQ1 no-argument method returns question 1
	 * @return q1
	 */
	public String getQ1() {
		return q1;
	}

	/**
	 * setQ1
	 * changes the question for the new one entered by parameters
	 * @param q1 : new question
	 */
	public void setQ1(String q1) {
		this.q1 = q1;
	}

	/**
	 * getQ2
	 * getQ2 no-argument method returns question 2
	 * @return q2
	 */
	public String getQ2() {
		return q2;
	}

	/**
	 * setQ2
	 * changes the question for the new one entered by parameters
	 * @param q2 : new question
	 */
	public void setQ2(String q2) {
		this.q2 = q2;
	}

	/**
	 * getQ2
	 * getQ2 no-argument method returns question 2
	 * @return q2
	 */
	public String getQ3() {
		return q3;
	}

	/**
	 * setQ3
	 * changes the question for the new one entered by parameters
	 * @param q3 : new question
	 */
	public void setQ3(String q3) {
		this.q3 = q3;
	}

}
