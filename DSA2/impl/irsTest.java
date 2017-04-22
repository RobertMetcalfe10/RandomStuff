package impl;

import java.util.Random;

public class irsTest extends SortingUtils{

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		Random rand=new Random();//random number
		for(int i=1;i<=500;i++)//creates 500 numbers
		{
			list.insertLast(rand.nextInt(889)+111);//random number between 999 and 111
		}
		System.out.println(list);
		integerRadixSort(list, 3);
		System.out.println(list);

	}

}
