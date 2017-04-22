package practical10;

import java.util.*;

import javax.swing.*;

public class isINT
{
	
	static boolean isInt(int n)
	{
		if(n%1==0)
		{
			return true;
		}
		return false;
		
	}
	static boolean isInt(double n)
	{
		if(n%1==0)
		{
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{
		int n=Integer.parseInt(JOptionPane.showInputDialog(null,"enter int","int goes here",JOptionPane.PLAIN_MESSAGE));
		double r=5.5;
		System.out.println(isInt(n));
		System.out.println(isInt(r));
		
//		Scanner i=new Scanner(System.in);
//		int a=i.nextInt();
//		System.out.println(a);
	}

}
