package practical8;

import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Q1
{
	public static void main(String[] args)
	{
		String myFileName = "C:/Users/lenovo/workspace/JavaPracticals/src/practical8/novel.txt";//taking in the file
		String wordToCheck=JOptionPane.showInputDialog(null, "What word would you like to search for?");
		try{
			FileReader myFile = new FileReader(myFileName);//txt is stored in a file reader 
			Scanner scanMyFile = new Scanner(myFile);//this is then scanned in
			
			String now,front,prev;
			now=scanMyFile.next();//make now take in the first word
			
			while(scanMyFile.hasNext())//while scanMyFile has values
			{
				prev = now;
				front = prev;
				now =front= scanMyFile.next();
				if(now.toLowerCase().equals(wordToCheck))//convert now to lower case and check when it equals the word to be checked
				{
					front = scanMyFile.next();//store the next word in front

					JOptionPane.showMessageDialog(null, prev+" "+now+" "+front);//displays the previous chosen and next word
				}	
			}
		}
		catch(Exception ex)
			{
				System.out.println("exception " + ex.getMessage() + " caught");//catches any exception
			}
	}

}