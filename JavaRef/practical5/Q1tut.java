package practical5;

import javax.swing.JOptionPane;

public class Q1tut
{

	public static void main(String[] args)
	{
		Person[] personList = new Person[5];
		for(int i=0; i<personList.length; i++)
		{
			personList[i]= new Person(JOptionPane.showInputDialog(null, "Enter Name"), Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Age")));
		}
		
		for(int i=0; i<personList.length; i++)
		{
			JOptionPane.showMessageDialog(null,"Box "+i+" of the array contains: "+personList[i].getDetails());
		}
		System.exit(0);

	}

	

}
