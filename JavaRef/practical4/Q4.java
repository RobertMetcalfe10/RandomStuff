package practical4;

import javax.swing.JOptionPane;

public class Q4
{

	public static void main(String[] args)
	{
		String progName="Rob";
		String name, secret;
		
		//user enters the name to be checked
		name=JOptionPane.showInputDialog(null,"Enter name");
		
		//name is then checked, not case sensitive, with the progName
		if(name.equalsIgnoreCase(progName))
		{
			//user is asked for a string
			secret=JOptionPane.showInputDialog(null,"Hi, "+progName+" tell me a secret");
			//if the length of the string is less than 20 letters
			if(secret.length()<20)
			{
				JOptionPane.showMessageDialog(null, "That's not much of a secret");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "That's a good secret, i'll never tell");
			}
		}
		else
		{
			//if the name is not equal to the progName
			JOptionPane.showMessageDialog(null, "Hello, "+name+" nice to meet you.");
		}
		System.exit(0);
	}

}
