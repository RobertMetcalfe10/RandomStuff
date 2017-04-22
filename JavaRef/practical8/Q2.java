package practical8;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Q2
{
	public static void main(String[] args)
	{
		String myFileName = "C:/Users/lenovo/workspace/JavaPracticals/src/practical8/number";//taking in the file
		List<List<String>> list=new ArrayList<List<String>>();// creates an ArrayList of type String
		try{
			FileReader myFile = new FileReader(myFileName);//txt is stored in a file reader
			Scanner scanMyFile = new Scanner(myFile);//this is then scanned in
			while(scanMyFile.hasNext())
			{
				list.add((List<String>) Arrays.asList(scanMyFile.next()));//takes in the next word, makes it part of an arrayList then casts to type list string
			}
			int size=list.size();
			int index=0;
			while(size!=0)
			{
				
				try
				{
					String str=list.get(index).toString();//stores the value in the given index in the list in str
					str=(str.substring(1, str.length()-1));//this is used to remove the first and last square brackets
					if(str.matches("^[0-9]+(\\.[0-9]{1,2})?$"))//regular expression to check when its a number, including decimals
					{
						String str1=list.get(index-1).toString();//gets previous
						str1=(str1.substring(1, str1.length()-1));
						String str11=list.get(index).toString();//gets number
						str11=(str11.substring(1, str11.length()-1));
						String str111=list.get(index+1).toString();//gets next
						str111=(str111.substring(1, str111.length()-1));
						JOptionPane.showMessageDialog(null, str1+" "+str11+" "+str111);//displays the previous number and next
					}
					index++;
				}
				catch(Exception ex)
				{
				System.out.println("exception " + ex.getMessage() + " caught");//catches any exception
				}
				
				size--;
			}
			
	
		}
		catch(Exception ex)
			{
				System.out.println("exception " + ex.getMessage() + " caught");//catches any excption
			}
			
	}
	

}