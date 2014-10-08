package Sponsors;
import Personal.*;

public class FestivalSponsor extends Sponsors implements NoOfYears{

	int noofyears;
	
	public FestivalSponsor(String name,Address addr,int noofyears,int money)
	{
		super(name,addr,money);
		this.noofyears =noofyears;
		
	}
	public int getnoofyears()
	{
		return noofyears;
	}
	
}
