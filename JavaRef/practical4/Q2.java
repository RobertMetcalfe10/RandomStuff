package practical4;

import javax.swing.JOptionPane;

public class Q2
{

	public static void main(String[] args)
	{
		int Num1, Num2, lower, higher, times, rem;
		
		//user enters integers
		Num1=(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number one")));
		Num2=(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number two")));
		
		//the integers are checked to see which are larger
		if(Num1<Num2)
		{
			lower=Num1;
			higher=Num2;
			
			//checks if the two numbers are evenly divisible
			if(Num2%Num1==0)
			{
				//finds the remainder and by how many times they divide into each other
				rem=Num2%Num1;
				times=Num2/Num1;
				JOptionPane.showMessageDialog(null, Num1+ " is a factor of " + Num2 + " (" + Num1+ " goes into " + Num2+", "+ times +" times)");	
			}
			else if(Num2%Num1!=0)
			{
				rem=Num2%Num1;
				times=Num2/Num1;
				JOptionPane.showMessageDialog(null, Num1+ " is not a factor of " + Num2 + " (" + Num1+ " goes into " + Num2+", "+ times +" times, with "+ rem+ " left over)");	
			}
			
		}
		else if(Num2<Num1)
		{
			lower=Num2;
			higher=Num1;
			
			if(Num2%Num1==0)
			{
				rem=Num2%Num1;
				times=Num2/Num1;
				JOptionPane.showMessageDialog(null, Num1+ " is a factor of " + Num2 + " (" + Num1+ " goes into " + Num2+", "+ times +" times)");	
			}
			else if(Num2%Num1!=0)
			{
				rem=Num2%Num1;
				times=Num2/Num1;
				JOptionPane.showMessageDialog(null, Num1+ " is not a factor of " + Num2 + " (" + Num1+ " goes into " + Num2+", "+ times +" times, with "+ rem+ " left over)");	
			}
		}
		//makes sure the JOption pane closes at the end
		System.exit(0);
	}

}
