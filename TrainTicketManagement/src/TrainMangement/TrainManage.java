package TrainMangement;

import java.util.ArrayList;
import java.util.HashMap;

import TrainBeans.Pasanger;
import TrainBeans.SeniorCitizen;
import TrainBeans.Ticket;
import TrainBeans.Train;

public class TrainManage implements TrainInterface 
{
	ArrayList<Train> tl = new ArrayList<Train>();
	public ArrayList<Train> getTl() {
		return tl;
	}
	public void setTl(ArrayList<Train> tl) {
		this.tl = tl;
	}
	public TrainManage(ArrayList<Train> tl) {
		super();
		this.tl = tl;
	}
	public boolean issueTicket(int trainNO, Ticket t)throws TicketAlreadyExist,LimitExceed
	{
		boolean tmatch = false;
		for (Train tt : tl)
		{
			System.out.println(tt.getTrainNo());
			if(tt.getTrainNo()==trainNO)
			{
			for(Ticket ti : tt.getAt())
			{
				System.out.println(ti.gettNo());
				System.out.println(t.gettNo());
				if(ti.gettNo()==t.gettNo())
					tmatch = true;
			}	
				if(tmatch)
				{
					System.out.println("already");
					throw new TicketAlreadyExist("Ticket Already Exist");
				}
				else if(tt.getAt().size()==4)
				{
					System.out.println("limit");
					throw new LimitExceed("Limit Exceed");
				}
				else
				{
					tt.getAt().add(t);
					System.out.println("Ho Gya");
					return true;
				}
			}
		}
		return false;
	}
	public HashMap<Integer,Integer> getCountOfSeniorCitizen()
	{
		int count = 0;
		HashMap<Integer,Integer> ht= new HashMap<Integer , Integer>();
		for(Train tt : tl)
		{
			for(Ticket ti : tt.getAt())
			{
				if(ti.getP().getAge()>=60)
				{
					System.out.println(ti.gettNo()+" "+ti.getP().getAge());
					count++;
				}	
			}
			ht.put(tt.getTrainNo(),count);
			count = 0;
				
		}
		return ht;
	}
	public boolean cancleTicket(int trainNo, int ticketNo)throws TicketDoesNotPresentExeption, InvalidTrainExeption
	{
		boolean ttrainNo = false;
		boolean tticketNo = false;
		for(Train tt : tl)
		{
			System.out.println(tt.getTrainNo());
			System.out.println(trainNo);
			if(tt.getTrainNo()==trainNo)
			{
				ttrainNo = true;
				for(Ticket ti : tt.getAt())
				{
					System.out.println(ti.gettNo());
					System.out.println(ticketNo);
					if(ti.gettNo()==ticketNo)
					{
						tticketNo = true;
						tt.getAt().remove("ticketNo");
						System.out.println("Cancle");
					}
				}
			}
		}
		if(!tticketNo)
			throw new TicketDoesNotPresentExeption("Ticket nhi h");
		if(!ttrainNo)
			throw new InvalidTrainExeption("Train nhi h");
		return false;
	}
	public ArrayList<Pasanger> getPasangerByGender(String gender)
	{
		ArrayList<Pasanger> pl = new ArrayList<Pasanger>();
		for (Train tt : tl)
		{
			for(Ticket ti : tt.getAt())
			{
				if(ti.getP().getGender().equalsIgnoreCase(gender))
					pl.add(ti.getP());
			}
		}
		pl.sort((Pasanger s1, Pasanger s2)->s1.getpName().compareTo(s2.getpName())); 
		return pl;
	}
}
