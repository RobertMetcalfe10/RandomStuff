package practical10;

import javax.swing.JOptionPane;

public class isMultiples
{
	static boolean isMultiple(long n, long m)
	{
	if(n%m==0)
	{
	System.out.println(n+ " is a multiple of "+m);
	return true;
	}
	return false;
	}

	public static void main(String[] args)
	{
		long n=Long.parseLong(JOptionPane.showInputDialog("Enter Long integer"));
		long m=Long.parseLong(JOptionPane.showInputDialog("Enter Long integer"));
		System.out.println(isMultiple(n,m));
	}

}
