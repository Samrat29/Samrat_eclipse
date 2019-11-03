package TrainMangement;

public class InvalidTrainExeption extends Exception 
{
	String e;

	public InvalidTrainExeption(String e) {
		super();
		this.e = e;
	}
	
}
