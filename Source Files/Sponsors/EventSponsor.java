package Sponsors;
import Personal.*;

public class EventSponsor extends Sponsors implements NoOfYears{
	
	int noofyears;
	Event e;
	
	public EventSponsor(String name,Address addr,int money,int noofyears,Event e)
	{
		super(name,addr,money);
		this.noofyears = noofyears;
		this.e = e;
	}
	public int getnoofyears()
	{
		return noofyears;
	}
		
}
