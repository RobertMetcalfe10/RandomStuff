package practical5;

public class Q3
{

	public static void main(String[] args)
	{
		String Names[]=new String[5];
		
		for(int i=0; i<=4; i++)
		{
			Names[i]=args[i];
		}
		
		String temp;
		
		for(int i=0; i<Names.length-1; i++)
		{
			for(int j=0; j<Names.length-1; j++)
			{
				if(Names[j].compareTo(Names[j+1])>0)
				{
					temp=Names[j];
					Names[j]=Names[j+1];
					Names[j+1]=temp;
				}
			}
		}
		for(int i=0; i<=4; i++)
		{
			System.out.println(Names[i]);
		}
		
		
	}

}
