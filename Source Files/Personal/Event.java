package Personal;
import java.util.*;

public class Event {
	private long evno;
	private String name;
	private int pos;
    ArrayList<Participant> list = new ArrayList<Participant>();
    ArrayList<Judge> list1 = new ArrayList<Judge>();
	
		
    
	public Event()
	{
		evno=0;
		name=null;
		pos =0;
	}
	public void addParti(Participant p)
	{
		list.add(p);
	}
	public void addJudge(Judge j)
	{
		list1.add(j);
	}
	
	
	public void setevno(long evno1)
	{
		evno = evno1;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public void setpos(int pos)
	{
		this.pos = pos;
	}
	
	public long getevno()
	{
		return evno; 
	}
	public String getname()
	{
		return name; 
	}
	public int getpos()
	{
		return pos; 
	}

}
