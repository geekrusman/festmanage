package Personal;

public class Person {
	protected String name;
	protected int age;
	protected String gender;
	protected long phno;
	
	public Person()
	{
		name=null;
		age=0;
		gender="m";
		phno=0;
	}
	
	public void setname(String name)
	{
		this.name =name;
	}
	public void setage(int age)
	{
		this.age =age;
	}
	public void setgender(String gen)
	{
		this.gender =gen;
	}
	public void setphno(long phno)
	{
		this.phno =phno;
	}
	public String getname()
	{
		return this.name;
	}
	public int getage()
	{
		return this.age;
	}
	public String getgender()
	{
		return this.gender;
	}
	public long getphno()
	{
		return this.phno;
	}
	
	
	
	
}
