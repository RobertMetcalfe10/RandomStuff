package practical6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	static int Average(int a,int b)
	{
		return (a+b)/2;
	}
	
	static int MaxInt(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	static int Difference(int a, int b)
	{
		if(a>b)
			return a-b;
		else
			return b-a;
	}
	
	static int MinValue(ArrayList<Integer> a1, int n)
	{
		int minValue=a1.get(0);
		for(int i=1; i<=n-1;i++)
		{
			if(minValue>a1.get(i))
			minValue=a1.get(i);
		}
		return minValue;
	}
	
	static int MinValueIndex(ArrayList<Integer> a1, int n)
	{
		int minValueIndex=0;
		for(int i=1; i<=n-1;i++)
		{
			if(a1.get(minValueIndex)>a1.get(i))
				minValueIndex=i;
		}
		return minValueIndex;
	}
	
	static int Power(int a, int b)
	{
		int power=1;
		for(int i=1; i<=b;i++)
		{
			power=power*a;
		}
		return power;
	}
	
	static int LinearSearch(ArrayList<Integer> a1, int n, int q)
	{
		int index=0;
		while((index<n)&&(a1.get(index)!=q))
		{
			index=index+1;
		}
		if(index==n)
			return -1;
		else
			return index;
	}
	
	
	
	public static void main(String[] args)
	{
		int a,b,n,q;
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Average= "+Average(a, b));
		System.out.println("MaxInt= "+MaxInt(a,b));
		System.out.println("Difference= "+Difference(a,b));
		double duration=0;
		for(int i=0; i<5; i++)
		{
			long start=System.currentTimeMillis();
			Difference(a,b);
			long end=System.currentTimeMillis();
			duration+=end-start;
		}
		duration=duration/5;
		System.out.println("Running time= "+duration);
		System.out.println("Power= "+Power(a,b));
		System.out.println("What size is the array");
		n=sc.nextInt();
		System.out.println("Enter the values in that array");
		
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt(); 
			A1.add(x);
		}
		
		System.out.println("MinValue= "+MinValue(A1, n));
		System.out.println("MinValueIndex= "+MinValueIndex(A1, n));
		double duration1=0;
		for(int i=0; i<5; i++)
		{
			long start=System.currentTimeMillis();
			MinValueIndex(A1, n);
			long end=System.currentTimeMillis();
			duration1+=end-start;
		}
		duration1=duration1/5;
		System.out.println("Running time= "+duration1);
		
		System.out.println("What value would you like to search for?");
		q=sc.nextInt();
		System.out.println("LinearSearch= "+LinearSearch(A1,n,q));
		double duration11=0;
		for(int i=0; i<5; i++)
		{
			long start=System.currentTimeMillis();
			LinearSearch(A1, n,q);
			long end=System.currentTimeMillis();
			duration11+=end-start;
		}
		duration11=duration11/5;
		System.out.println("Running time= "+duration11);
		sc.close();
	}

}
