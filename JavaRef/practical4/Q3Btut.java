package practical4;

import javax.swing.JOptionPane;

public class Q3Btut
{

	public static void main(String[] args)
	{
		String star="*";//the star that will be printed
		int starNum;
		
		//user enters how many stars they want, this string is then converted to an int
		starNum=(Integer.parseInt(JOptionPane.showInputDialog(null,"How many stars would you like?")));
		
		//outer loop runs till the user input is less than r
		for(int r = 1; starNum>=r; starNum--)
		{
			//inner loop runs till it hits the variable r
			for(int i = 1; i<=starNum; i++)
			{
				System.out.print(star);
			}	
			
			System.out.print("\n");
		}
		
		
		System.exit(0);

	}

}
