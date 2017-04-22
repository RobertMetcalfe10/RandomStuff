package impl;

import java.util.Random;
import impl.SortingUtils;
import core.List;

public class sdbsTest extends SortingUtils {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		Random rand=new Random();//random number
		for(int i=0;i<=499;i++)//creates a 500 numbers
		{
			list.insertLast(rand.nextInt(9));//random number between 0 and 100
		}
		System.out.println(list);
		singleDigitBucketSort(list);
		System.out.println(list);

	}

}
