package practical4;

import javax.swing.JOptionPane;

public class Q1
{

	public static void main(String[] args)
	{
		int Num1, Num2;
		
		//user enters integers
		Num1=(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number one")));
		Num2=(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number two")));
		
		//the integers are checked to see which are larger and then printed out depending on the largest
		if(Num1<Num2)
		{
			JOptionPane.showMessageDialog(null, "The first number, " + Num1 + " is less than the second number, " + Num2 );
		}
		else if(Num2<Num1)
		{
			JOptionPane.showMessageDialog(null, "The second number, " + Num2 + " is less than the first number, " + Num1 );	
		}
		else if(Num1==Num2)
		{
			JOptionPane.showMessageDialog(null, "The two numbers are equal" );	
		}
		System.exit(0);
	}

}
