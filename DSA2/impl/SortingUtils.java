package impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import core.List;
import core.Position;

public class SortingUtils {
	@SuppressWarnings("unchecked")
	public static void singleDigitBucketSort(List<Integer> list) {
		List<Integer>[] buckets = (List<Integer>[]) Array.newInstance(List.class, 10);
		
		// Step 1: Copy the values from the list into the buckets.
		while (!list.isEmpty()) {
			int value = list.remove(list.first());
			if (value < 0 || value > 9) throw new UnsortableException("The list contains an invalid value: " + value);
			if (buckets[value] == null) {
				buckets[value] = new LinkedList<Integer>();
			}
			buckets[value].insertLast(value);
		}
		
		// Step 2: Copy the values from the buckets to the list.
		for (int i=0; i < buckets.length; i++) {
			if (buckets[i] != null) {
				while (!buckets[i].isEmpty()) {
					list.insertLast(buckets[i].remove(buckets[i].first()));
				}
			}
		}
	}

	public static void integerBucketSort(List<Integer> list, int lower, int upper) {
		@SuppressWarnings("unchecked")
		List<Integer>[] buckets = (List<Integer>[]) Array.newInstance(List.class, upper-lower);
		
		// Step 1: Copy the values from the list into the buckets.
				while (!list.isEmpty()) {//until list is empty
					int value = list.remove(list.first());//removes first element in the list
					if (value < lower || value > upper) throw new UnsortableException("The list contains an invalid value: " + value);
					if (buckets[value-lower] == null) {
						buckets[value-lower] = new LinkedList<Integer>();//bucket index=the actual value-lower possible value
					}
					buckets[value-lower].insertLast(value);
				}
				
				// Step 2: Copy the values from the buckets to the list.
				for (int i=0; i < buckets.length; i++) {
					if (buckets[i] != null) {
						while (!buckets[i].isEmpty()) {
							list.insertLast(buckets[i].remove(buckets[i].first()));
						}
					}
				}
		
	}
	
	public static void integerRadixSort(List<Integer> list, int digits) {
		
		@SuppressWarnings("unchecked")
		List<Integer>[] buckets = (List<Integer>[]) Array.newInstance(List.class, list.size());
		int num=0;
		for(int i=0; i<digits;i++)//we need to loop for the max number of digits
		{	
		    {
				// Step 1: Copy the values from the list into the buckets.
						while (!list.isEmpty()) {//until list is empty
							int value = list.remove(list.first());//removes first element in the list
		          //find the digit using the formula given
							num=(int) ((value/Math.pow(10, i))%10);
							if (num < 0 || num > 9) throw new UnsortableException("The list contains an invalid value: " + value);
							if (buckets[num] == null) {
								buckets[num] = new LinkedList<Integer>();//bucket index=the digit itself
							}
							buckets[num].insertLast(value);
						}
						
						// Step 2: Copy the values from the buckets to the list.
						for (int r=0; r < buckets.length; r++)
						{
							if (buckets[r] != null) {
								while (!buckets[r].isEmpty()) {
									list.insertLast(buckets[r].remove(buckets[r].first()));
								}
							}
						}
		    }
		}
	}
	
	
	
	public static void stringRadixSort(List<String> list,int length) {
		
		@SuppressWarnings("unchecked")
		List<String>[] buckets = (List<String>[]) Array.newInstance(List.class, 26);
		int offset=1;//used for getting substring
		// Step 1: Copy the values from the list into the buckets.
		for (int i = length; i > 0; i--) {//length of the longest word, decrements
		        while (!list.isEmpty()) {//until list is empty
		            String word = list.remove(list.first());//removes first element in the list
		            String letter = "";
		            try//trys to get the substring of the word, if it can't catches a StringOutOfBoundsException
		            {
		            	 letter= word.substring(word.length() - offset, word.length()-(offset-1));
		            }
		            catch(StringIndexOutOfBoundsException e)
		            {
		            	letter=word.substring(0, 1);//gets the first letter of the word
		            }
		            char ch = letter.charAt(0);
		            int index = ch - 'a';    //gets index of each letter ('a' = buckets[0], 'z' = buckets[25]
		            if (buckets[index] == null) {
		                buckets[index] = new LinkedList<String>();
		            }
		            buckets[index].insertLast(word);
		        }
		     // Step 2: Copy the values from the buckets to the list.
		        for (int j = 0; j < buckets.length; j++) {
		            if (buckets[j] != null) {
		                while (!buckets[j].isEmpty()) {
		                    list.insertLast(buckets[j].remove(buckets[j].first()));
		                }
		            }
		        }
		        offset++;
		    }
		
	}
	
	
}
