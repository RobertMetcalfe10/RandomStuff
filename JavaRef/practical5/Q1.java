package practical5;

import javax.swing.JOptionPane;

public class Q1
{

	public static void main(String[] args)
	{
		String Names[]=new String[5];
		for(int i=0; i<=4; i++)
		{
			Names[i]=JOptionPane.showInputDialog(null, "Enter name");
		}
		for(int i=0; i<=4; i++)
		{
			JOptionPane.showMessageDialog(null, "Box "+i+" of the Names array conatins: "+Names[i]);
		}
		
	}

}
