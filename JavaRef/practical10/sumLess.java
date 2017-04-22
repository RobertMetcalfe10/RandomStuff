package practical10;

import javax.swing.JOptionPane;

public class sumLess
{
	public static int sumOfLessThan(int n)
	{
	    int result = 0;
	    for(int i = n - 1; i > 0; i--)
	    {
	            result = result + i;
	    }
	    return result;
	}
	
	public static void main(String[] args)
	{
		int n=Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
		System.out.println(sumOfLessThan(n));
	}

}
