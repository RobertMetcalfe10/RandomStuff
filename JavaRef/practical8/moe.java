// Muhammad Dagari - 15499782 - JAVA -- Tutorial - Part 1
package practical8;
import java.util.List;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class moe 
{
	public static void main(String args[])
	{
		List<List<String>> list= new ArrayList<List<String>>();
		
		
		String myFileName = "C:/Users/lenovo/workspace/JavaPracticals/src/practical8/novel.txt";
		String word=JOptionPane.showInputDialog(null,"Enter the word you would like to search for");
		
		
		int wordcount = 0;
		try
		{
			FileReader File = new FileReader(myFileName);
			Scanner scanMyFile = new Scanner(File);
			while( scanMyFile.hasNext()) 
			{
				list.add((List<String>) Arrays.asList(scanMyFile.next()));
				wordcount+=1;
		
			}
			int size=list.size();
			int index=0;
			while(size!=0)
			{
				try
				{
					String str=list.get(index).toString();
					str=str.substring(1,str.length()-1);
					if(word.equals(str))
					{
						String str1 = list.get(index-1).toString();
						str1=str1.substring(1,str1.length()-1);
						String str11 = list.get(index).toString();
						str11=str11.substring(1,str11.length()-1);
						String str111 = list.get(index+1).toString();
						str111=str111.substring(1,str111.length()-1);
						JOptionPane.showMessageDialog(null,str1+" "+str11+" "+str111);
					}
					
					index++;
				}
				catch(Exception ex)
				{
					System.out.println("exception "+ex.getMessage()+" caught");
				}
				size--;
			}
		} catch(Exception ex) 
		{
			System.out.println("exception "+ex.getMessage()+" caught");
		}
		System.out.println("file " +myFileName + " contains "+wordcount+ " words.");
	}
	
}
