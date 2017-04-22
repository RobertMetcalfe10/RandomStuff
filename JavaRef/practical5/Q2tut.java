package practical5;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Q2tut
{

	public static void main(String[] args)
	{
		Person[] personList = new Person[5];
		for(int i=0; i<personList.length; i++)
		{
			personList[i]= new Person(JOptionPane.showInputDialog(null, "Enter Name"), Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Age")));
		}
		int[] num = {0,0,0,0,0};
		int ageVerf=Integer.parseInt(JOptionPane.showInputDialog(null, "To what age would you like the data"));
		for(int i=0; i<personList.length; i++)
		{
			StringTokenizer multiTokenizer = new StringTokenizer(personList[i].getDetails(), " /nQWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm()");
			while (multiTokenizer.hasMoreTokens())
			{
				num[i]=Integer.parseInt((multiTokenizer.nextToken()));
			}	
		}
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]<=ageVerf)
			{
				JOptionPane.showMessageDialog(null,"Box "+i+" of the array contains: "+personList[i].getDetails());
			}
			
		}
		
		

		
		System.exit(0);
	}

}
