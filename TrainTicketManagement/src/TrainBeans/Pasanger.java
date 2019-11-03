package TrainBeans;

public class Pasanger extends SeniorCitizen
{
	String pName;
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	String gender;
	String source;
	String destination;
	
	public Pasanger(int age, String pName, String gender, String source, String destination) {
		super(age);
		this.pName = pName;
		this.gender = gender;
		this.source = source;
		this.destination = destination;
	}
		/*@Override public String toString() {     
		      return ("Student[ "+"Name:"+this.getpName()+             
		              " Age: "+ this.getAge() +                     
		              " source: "+ this.getSource()+"destination : "+this.getDestination()+"]"); 
	}*/
}
