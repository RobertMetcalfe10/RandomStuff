package practical10;

public class allStrings
{
	public static void main(String[] args)
	{
		option("carbon");
	}
		  
		 private static void option(String string)
		 {
		  printOption(string,"");
		 }
		 
		 private static void printOption(String string, String permutation)
		 {  
			 if(string.length()==0)
			 {
				 System.out.println(permutation);
				 return;
			 }
		   
		  		for (int i = 0; i < string.length(); i++)
		  		{
		  			char append = string.charAt(i);
		  			String left = string.substring(0, i) + string.substring(i + 1);
		  			printOption( left,  permutation + append);
		  		}
		 }
}
