package practical5;

import javax.swing.JOptionPane;

public class Q2
{

	public static void main(String[] args)
	{
		String Names[]=new String[5];
		for(int i=0; i<=4; i++)
		{
			Names[i]=JOptionPane.showInputDialog(null, "Enter name");
		}

		String searchname=JOptionPane.showInputDialog(null, "Enter name you are seqrching for");
		
		for(int i=0; i<=4; i++)
		{
			if(searchname.equals(Names[i]))
			{
				JOptionPane.showMessageDialog(null, searchname+" was found in box "+i+" in the array");
			}
			System.exit(0);
		}
		
	}

}
