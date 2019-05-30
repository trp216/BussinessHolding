package model;

public class ServiceCompany extends Company{
	
	private Poll[] arrayPoll;
	

	public ServiceCompany(String n) {
		super(n);
	}

	public Poll[] getArrayPoll() {
		return arrayPoll;
	}
	
	public void addPoll(Poll p) {
		for(int i = 0;i<arrayPoll.length;i++) {
			if(arrayPoll[i]==null)
				arrayPoll[i]=p;
		}
	}
	
}
