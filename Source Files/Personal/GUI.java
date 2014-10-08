package Personal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.io.*;
import java.util.*;

public class GUI {

	JLabel[] jl = new JLabel[5];
	Participant[] parti;
	Event[] eve;
	int size1;
	int size2;
	HashMap<Long,String> hm;
	public GUI() throws Exception
	{
		JFrame jf = new JFrame("Festival Manager");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		jf.setSize(350,350);
		
		
		FileReader fr = new FileReader("Event.txt");
		BufferedReader br = new BufferedReader(fr);
		FileReader fr1 = new FileReader("Participant.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		
		String str =null;
		ArrayList<String> plist = new ArrayList<String>();
		ArrayList<String> elist = new ArrayList<String>();
		
		while((str = br.readLine())!=null)
		{
			elist.add(str);
			//System.out.println(str);
		}
		while((str = br1.readLine())!=null)
		{
			plist.add(str);
			//System.out.println(str);
		}
		
		JMenuBar jm = new JMenuBar();
		jf.setJMenuBar(jm);
		
		 size1 = plist.size();
		 size2 = elist.size();
		
		JMenu jmen = new JMenu("Participant");
		JMenu jmen1 = new JMenu("Event");
		
		jm.add(jmen);
		jm.add(jmen1);
		
		JMenuItem[] ji = new JMenuItem[size1];
		JMenuItem[] ji1 = new JMenuItem[size2];
		
		jl[0] = new JLabel("");
		jl[0].setBounds(50,50,300,15);
		jl[1] = new JLabel("");
		jl[1].setBounds(50,75,300,15);
		jl[2] = new JLabel("");
		jl[2].setBounds(50,100,300,15);
		jl[3] = new JLabel("");
		jl[3].setBounds(50,125,300,15);
		jl[4] = new JLabel("");
		jl[4].setBounds(50,155,300,15);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.add(jl[0]);
		jp.add(jl[1]);
		jp.add(jl[2]);
		jp.add(jl[3]);
		jp.add(jl[4]);
		
		jf.setContentPane(jp);
		
		Iterator itr = plist.iterator();
		Listener lis = new Listener();
		Listn lis1 = new Listn();
		
		int i=0;
		while(itr.hasNext())
		{
			String str1 = (String)itr.next();
			String[] arr = str1.split(" ");
			ji[i] = new JMenuItem(arr[0]);
			ji[i].addActionListener(lis);
			jmen.add(ji[i]);
			i++;
		}
		
		i=0;
		itr = elist.iterator();
		while(itr.hasNext())
		{
			String str1 = (String)itr.next();
			String[] arr = str1.split(" ");
			ji1[i] = new JMenuItem(arr[1]);
			ji1[i].addActionListener(lis1);
			jmen1.add(ji1[i]);
			
			i++;
		}
		jf.setVisible(true);
		
		
		//Event Creation
	    eve = new Event[size2];
		hm = new HashMap<Long,String>();
		
		for(i=0;i<size2;i++)
		{
			String st1 = elist.get(i);
			String[] arr = st1.split(" ");
			eve[i] = new Event();
			
			eve[i].setevno(Long.parseLong(arr[0]));
			eve[i].setpos(Integer.parseInt(arr[2]));
			eve[i].setname(arr[1]);
			
			hm.put(Long.parseLong(arr[0]),arr[1]);			
		}
		
		// Participant creation
		
			    parti = new Participant[size1];
				for(i=0;i<size1;i++)
				{
					String st1 = plist.get(i);
					String[] arr = st1.split(" ");
					parti[i] = new Participant();
					
					College c = new College();
				    c.setcoll(arr[5]);
				    c.setuniv(arr[6]);
				    
				    Address a = new Address();
				    a.setcity(arr[8]);
				    a.setpincode(arr[7]);
				    a.setstate(arr[9]);
				    a.setstreet(arr[10]);
				    
					parti[i].setAddress(a);
					parti[i].setage(Integer.parseInt(arr[1]));
					parti[i].setCollege(c);
					parti[i].setgender(arr[2]);
					parti[i].setidno(arr[4]);
					parti[i].setname(arr[0]);
					parti[i].setphno(Long.parseLong(arr[3]));
					parti[i].setEvent(Integer.parseInt(arr[11]));		
				}
				
			
		
	}
	
	class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JMenuItem g = (JMenuItem)e.getSource();
			String name = g.getText();
			//System.out.println(name);
			
			for(int y=0;y<size1;y++)
			{
				if((parti[y].getname()).equals(name))
				{
					String evname = hm.get((long)parti[y].getEvent());
					jl[0].setText("NAME : "+name);
					jl[1].setText("AGE : "+parti[y].getage());
					jl[2].setText("EVENT NAME : "+evname);
					jl[3].setText("IDNO : "+parti[y].getidno());
					jl[4].setText("GENDER : "+parti[y].getgender());
					break;
				}
			}	
				
		}
	}
	
	class Listn implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			jl[0].setText("");
			jl[1].setText("");
			jl[2].setText("");
			jl[3].setText("");
			jl[4].setText("");
			
			JMenuItem g = (JMenuItem)e.getSource();
			String name = g.getText();
			
			for(int h = 0;h<size2;h++)
			{
				if((eve[h].getname()).equals(name))
				{
					jl[1].setText("EVENT NAME : "+name);
					jl[0].setText("EVENT ID : "+eve[h].getevno());
					jl[2].setText("EVENT POS : "+eve[h].getpos());
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			new GUI();
		}
		catch(Exception e)
		{
			System.out.println("aerrrror");
		}
	}
	
}
