package Personal;

public class Participant extends Person implements Comparable<Participant>{
	
	protected String idno;
	protected College c;
	protected Address addr;
	protected int evno;

	public Participant()
	{
		idno =null;
		c =null;
		addr=null;
		evno = 0;
	}
	
	
	public int compareTo(Participant o)
	{
		return this.age - o.age;
	}
	
	public void setidno(String idno)
	{
		this.idno = idno;
	}
	public void setCollege(College c)
	{
		this.c = c;
	}
	public void setAddress(Address addr)
	{
		this.addr = addr;
	}
	public void setEvent(int evno)
	{
		this.evno = evno;
	}
	
	public String getidno()
	{
		return this.idno;
	}
	public College getCollege()
	{
		return this.c;
	}
	public Address getAddress()
	{
		return this.addr;
	}
	public int getEvent()
	{
		return this.evno;
	}
	
	
	
}
