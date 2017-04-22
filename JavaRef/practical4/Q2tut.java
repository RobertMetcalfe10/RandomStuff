package practical4;

import javax.swing.JOptionPane;

public class Q2tut
{

	public static void main(String[] args)
	{
		String word="1";
		String[] len = {"","","","","","","","","",""};//array of strings for storage
		int i=0;
		String join="";
	
		//while word is not equal to null and word is not empty
		while(word != null && !word.isEmpty())
		{
			//user enters words
			word=JOptionPane.showInputDialog(null,"Enter word");
			len[i]=word;//they are put into the array of strings
			i++;
		}
		for(int r=0; r<=i; r++)
		{
			join+=(len[r]+" ");//using a for loop, each word and a space is added together to form one string
		}
		JOptionPane.showMessageDialog(null, join);
		
		System.exit(0);

	}

}
