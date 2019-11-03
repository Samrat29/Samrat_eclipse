package TrainMangement;

public class TicketAlreadyExist extends Exception
{
	String e;

	public TicketAlreadyExist(String e)
	{
		super();
		this.e = e;
	}
	
}
