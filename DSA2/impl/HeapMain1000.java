package impl;

import java.util.Random;

public class HeapMain1000 {

	public static void main(String[] args) {
		Heap<Integer> heap=new Heap<Integer>();//new heap
		Random rand=new Random();//random number
		for(int i=0;i<=999;i++)//creates a 1000 numbers
		{
			heap.add(rand.nextInt(100));//random number between 0 and 100
			i++;
		}
		System.out.println(heap);
	}

}
