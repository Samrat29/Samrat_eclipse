package TrainBeans;

import java.util.ArrayList;

public class Train 
{
	int trainNo;
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getsStation() {
		return sStation;
	}
	public void setsStation(String sStation) {
		this.sStation = sStation;
	}
	public String getdStation() {
		return dStation;
	}
	public void setdStation(String dStation) {
		this.dStation = dStation;
	}
	public ArrayList<Ticket> getAt() {
		return at;
	}
	public void setAt(ArrayList<Ticket> at) {
		this.at = at;
	}
	String sStation;
	String dStation;
	ArrayList<Ticket> at = new ArrayList<Ticket>();
	public Train(int trainNo, String sStation, String dStation, ArrayList<Ticket> at) {
		super();
		this.trainNo = trainNo;
		this.sStation = sStation;
		this.dStation = dStation;
		this.at = at;
	}
}
