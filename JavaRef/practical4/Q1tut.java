package practical4;

import javax.swing.JOptionPane;

public class Q1tut
{

	public static void main(String[] args)
	{	String word="1";
		int[] len = {0,0,0,0,0,0,0,0,0,0,0,0,0};//integer array for storing the words
		int i=0;
		int sum = 0;
	
		//while the variable word is not equal to null and isnt empty
		while(word != null && !word.isEmpty())
		{
			
			word=JOptionPane.showInputDialog(null,"Enter word");
			len[i]=word.length();//assigns the length of word to the array
			i++;//incrementer
		}
		
		//enhanced for loop for adding the lengths together
		for (int r : len)
		    sum += r;
		
		JOptionPane.showMessageDialog(null, "The total number of letters= "+sum);
		
		System.exit(0);
	}

}
