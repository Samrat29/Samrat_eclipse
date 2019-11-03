package TrainBeans;

public class Ticket 
{
	int tNo;
	public int gettNo() {
		return tNo;
	}
	public void settNo(int tNo) {
		this.tNo = tNo;
	}
	public double gettPrice() {
		return tPrice;
	}
	public void settPrice(double tPrice) {
		this.tPrice = tPrice;
	}
	public Pasanger getP() {
		return p;
	}
	public void setP(Pasanger p) {
		this.p = p;
	}
	double tPrice;
	Pasanger p;
	public Ticket(int tNo, double tPrice, Pasanger p) {
		super();
		this.tNo = tNo;
		this.tPrice = tPrice;
		this.p = p;
	}
}
