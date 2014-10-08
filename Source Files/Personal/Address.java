package Personal;

public class Address {
	private String pincode;
	private String city;
	private String state;
	private String street;
	
	public Address()
	{
		pincode =null;
		city=null;
		state =null;
		street=null;
	}
	
	public void setpincode(String pincode)
	{
		this.pincode = pincode;
	}
	public void setcity(String city)
	{
		this.city = city;
	}
	public void setstate(String state)
	{
		this.state = state;
	}
	public void setstreet(String street)
	{
		this.street = street;
	}
	public String getpincode()
	{
		return this.pincode;
	}
	public String getcity()
	{
		return this.city ;
	}
	public String getstate()
	{
		return this.state;
	}
	public String getstreet()
	{
		return this.street;
	}
	
	
	
}
