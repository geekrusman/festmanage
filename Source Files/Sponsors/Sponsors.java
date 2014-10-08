package Sponsors;
import Personal.Address;

public abstract class Sponsors implements Comparable<Sponsors>{
	protected String name;
	protected Address addr;
	protected int money;
	
	public Sponsors(String name,Address addr,int money)
	{
		this.name = name;
		this.addr = addr;
		this.money =money;
	}
	
	public int compareTo(Sponsors o)
	{
		return this.money-o.money;
	}
}
