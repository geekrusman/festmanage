package Personal;

public class Judge extends Person{
	
	int exp;
	Address addr;
	Event e;
	public Judge()
	{
		exp=0;
		addr=null;
	}
	public void setexp(int exp)
	{
		this.exp = exp;
	}
	public void setaddr(Address addr)
	{
		this.addr =addr;
	}
	public void setevent(Event e)
	{
		this.e =e;
	}
	
	public int getexp()
	{
		return exp;
	}
	public Address getaddr()
	{
		return addr;
	}
	public Event getevent()
	{
		return e;
	}

}
