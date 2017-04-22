package impl;

import java.util.Random;

public class ibsTest extends SortingUtils {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		Random rand=new Random();//random number
		for(int i=0;i<=499;i++)//creates 500 numbers
		{
			list.insertLast(rand.nextInt(200)+50);//random number between 50 and 250
		}
		System.out.println(list);
		integerBucketSort(list, 50, 250);
		System.out.println(list);
	}

}
