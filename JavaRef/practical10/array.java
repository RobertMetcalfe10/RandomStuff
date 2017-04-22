package practical10;

public class array
{

	public static void main(String[] args)
	{
		int array[]={1,2,3,4,1,6};
		int r=5;
		for(int i=0;i<=5;i++)
		{
			if(i!=r)
			{
				if(array[i]!=array[r])
				{
					System.out.println("Distinct Value");
				}
				else
				{
					System.out.println("Non Distinct Value Found");
				}
			}
			else if(array[i]!=array[r])
			{
				System.out.println("Distinct Value");
			}
			else
			{
				System.out.println("Non Distinct Value Found");
			}
			r--;
		}

	}

}
