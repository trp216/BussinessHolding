package model;

public class Question {
	
	private String q1;
	private String q2;
	private String q3;
	
	public Question() {
		q1 = "How satisfied are you with the service provided?";
		q2 = "How satisfied are you with the response time?";
		q3 = "How satisfied are you with the cost/benefit ratio of the service purchased?";
	}

	public String getQ1() {
		return q1;
	}

	public void setQ1(String q1) {
		this.q1 = q1;
	}

	public String getQ2() {
		return q2;
	}

	public void setQ2(String q2) {
		this.q2 = q2;
	}

	public String getQ3() {
		return q3;
	}

	public void setQ3(String q3) {
		this.q3 = q3;
	}

}
