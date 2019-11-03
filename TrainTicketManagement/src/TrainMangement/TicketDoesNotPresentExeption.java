package TrainMangement;

public class TicketDoesNotPresentExeption extends Exception 
{
	String e;

	public TicketDoesNotPresentExeption(String e) {
		super();
		this.e = e;
	}
	
}
