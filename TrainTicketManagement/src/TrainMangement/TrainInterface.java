package TrainMangement;

import java.util.ArrayList;
import java.util.HashMap;

import TrainBeans.Pasanger;
import TrainBeans.Ticket;

public interface TrainInterface
{
	public boolean issueTicket(int trainNO, Ticket t)throws TicketAlreadyExist,LimitExceed ;
	public HashMap<Integer,Integer> getCountOfSeniorCitizen();
	public boolean cancleTicket(int trainNo, int ticketNo)throws TicketDoesNotPresentExeption, InvalidTrainExeption;
	public ArrayList<Pasanger> getPasangerByGender(String gender);
}
