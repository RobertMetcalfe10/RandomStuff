package impl;

public class srsTest extends SortingUtils{

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		int length=0;
		String[] result = "the big black cat sat on the beautiful brown mat".split("\\s");
	    for (int x=0; x<result.length; x++)
	    {	
	    	if(result[x].length()>length)
	    	{
	    		length=result[x].length();
	    	}
	    	
	    	list.insertLast(result[x]);
	    }
	    System.out.println(list);
	    stringRadixSort(list,length);
	    System.out.println(list);
	}

}
