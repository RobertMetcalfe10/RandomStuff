package practical4;

import javax.swing.JOptionPane;

public class Q4tut
{

	public static void main(String[] args)
	{
		String star="*";//the star that will be printed
		int starNumH, starNumW;
		
		//user enters how many stars they want, this string is then converted to an int
		starNumW=(Integer.parseInt(JOptionPane.showInputDialog(null,"How many stars wide?")));
		starNumH=(Integer.parseInt(JOptionPane.showInputDialog(null,"How many stars tall?")));
		
		//prints out stars for the top border
		for(int r=1; r<=starNumW; r++)
		{
			System.out.print(star);
		}
		
		System.out.print("\n");//so the stars dont clash
		
		//prints out the stars for the sides
		for(int r=1; r<=starNumH; r++)
		{
			System.out.print(star);
			for(int i=1; i<starNumW-1; i++)
			{
				System.out.print(" ");
			}
			System.out.println(star);
		}
			
		//prints out the stars for the bottom border
		for(int r=1; r<=starNumW; r++)
		{
			System.out.print(star);
		}
		
		System.exit(0);

	}

}
