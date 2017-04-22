package practical10;

import javax.swing.JOptionPane;

public class multiplyArrays
{

	public static void main(String[] args)
	{
		int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the length of the array"));
		int array1[]=new int[n];
		int array2[]=new int[n];
		int array3[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			array1[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter value in array1"));
		}
		for(int i=0;i<n;i++)
		{
			array2[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter value in array2"));
		}
		for(int i=0;i<n;i++)
		{
			array3[i]=array1[i]*array2[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(array3[i]);
		}
	}

}
