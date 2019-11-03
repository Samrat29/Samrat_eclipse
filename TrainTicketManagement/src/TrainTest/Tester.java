package TrainTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import TrainBeans.Pasanger;
import TrainBeans.SeniorCitizen;
import TrainBeans.Ticket;
import TrainBeans.Train;
import TrainMangement.InvalidTrainExeption;
import TrainMangement.LimitExceed;
import TrainMangement.TicketAlreadyExist;
import TrainMangement.TicketDoesNotPresentExeption;
import TrainMangement.TrainManage;

public class Tester
{
	public static void main(String... ar)
	{
		Pasanger p1 = new Pasanger(20,"Hero","male","indore","pune");
		Pasanger p2 = new Pasanger(30,"tero","female","ujjain","mumbai");
		Pasanger p3 = new Pasanger(10,"sero","male","chennai","indore");
		Pasanger p4 =new Pasanger(60,"bero","female","pune","indore");
		Pasanger p5 =new Pasanger(40,"pero","female","pune","indore");
		Pasanger p6 =new Pasanger(48,"rero","male","pune","indore");
		SeniorCitizen p7 =(SeniorCitizen)new Pasanger(70,"xero","female","pune","indore");
		SeniorCitizen p8 =new Pasanger(80,"kero","male","pune","indore");
		
		Ticket t1 = new Ticket(101,500,p1);
		Ticket t2 = new Ticket(102,600,p2);
		Ticket t3 = new Ticket(103,700,(Pasanger)p7);
		Ticket t4 = new Ticket(104,800,p4);
		
		Ticket t5 = new Ticket(105,500,(Pasanger)p8);
		Ticket t6 = new Ticket(106,600,(Pasanger)p8);
		Ticket t7 = new Ticket(107,700,p3);
		Ticket t8 = new Ticket(108,800,(Pasanger)p7);
		
		Ticket t9 = new Ticket(109,500,p1);
		Ticket t10 = new Ticket(110,600,p2);
		Ticket t11 = new Ticket(111,700,p3);
		Ticket t12 = new Ticket(112,800,(Pasanger)p4);
		
		ArrayList<Ticket> at1 = new ArrayList<Ticket>();
		at1.add(t1);
		at1.add(t2);
		//at1.add(t3);
		
		ArrayList<Ticket> at2 = new ArrayList<Ticket>();
		at2.add(t4);
		at2.add(t5);
		//at2.add(t6);
		
		ArrayList<Ticket> at3 = new ArrayList<Ticket>();
		at3.add(t7);
		at3.add(t8);
		at3.add(t9);
		
		ArrayList<Ticket> at4 = new ArrayList<Ticket>();
		at4.add(t10);
		at4.add(t11);
		at4.add(t12);
		
		Train tr1 = new Train(01,"indore","pune",at1);
		Train tr2 = new Train(02,"channai","bangalore",at2);
		Train tr3 = new Train(03,"ujjain","mumbai",at3);
		Train tr4 = new Train(04,"gwalior","punjab",at4);
		
		ArrayList<Train> tt1 = new ArrayList<Train>();
		tt1.add(tr1);
		tt1.add(tr2);
		
		ArrayList<Train> tt2 = new ArrayList<Train>();
		tt2.add(tr3);
		tt2.add(tr4);
		
		TrainManage tm = new TrainManage(tt1);
		//tm.setTl(tt2);
		try
		{
			tm.issueTicket(01,t3);
			tm.issueTicket(01,t4);
			tm.issueTicket(02,t2);
		}
		catch (TicketAlreadyExist t)
		{
			System.out.println(t.getMessage());
		}
		catch (LimitExceed t)
		{
			System.out.println(t.getMessage());
		}
		
		HashMap<Integer,Integer> ht = new HashMap<Integer,Integer>();
		ht= tm.getCountOfSeniorCitizen();
		for (Map.Entry<Integer,Integer> entry : ht.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
	/*	try
		{
			tm.cancleTicket(01,102);
		}
		catch (InvalidTrainExeption t)
		{
			System.out.println(t.getMessage());
		}
		catch (TicketDoesNotPresentExeption t)
		{
			System.out.println(t.getMessage());
		}*/
		ArrayList<Pasanger> p = new ArrayList<Pasanger>();
		p = tm.getPasangerByGender("male");
		for (Pasanger pp : p)
		{
			System.out.println(pp.getpName()+" "+pp.getGender());
		}
	}	
}
