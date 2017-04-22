package practical4;

import javax.swing.JOptionPane;

public class Q3
{

	public static void main(String[] args)
	{
		double circleNum, rectangleNum, triangleNum, pi=3.14159;
		int option;
		String circle="circle", rectangle="rectangle", triangle="triangle";
		
		//using the show option dialog to allow the user to select whether they want to work with a circle,rectangle or triangle
		
		Object[] options = {"circle",
                "rectangle",
                "triangle"};
		
		option=JOptionPane.showOptionDialog(null,
			    "Would you like to know the area of a circle, reactangle or triangle",
			    "Area of a Shape",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    options,
			    options[2]);
		
		//if the user clicks circle
		if(option==0)
		{
			//user enters the radius, which is then converted from string to a double
			double rad=(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter radius")));
			if(rad>0)
			{
				circleNum=(pi*rad*rad);
				JOptionPane.showMessageDialog(null, "A circle of radius "+rad+" has an area of "+circleNum);
			}
			else
			{
				//if the user doesn't enter a positive number
				JOptionPane.showMessageDialog(null, "Can't compute");
			}
		}
		//if the user clicks rectangle
		else if(option==1)
		{
			double length=(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length")));
			double width=(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter width")));
			if(length>0&&width>0)
			{
				rectangleNum=(width*length);
				JOptionPane.showMessageDialog(null, "A rectangle has a length of "+length+" and a width of "+width+", it has an area of "+rectangleNum);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Can't compute");
			}
			
		}
		//if the user clicks triangle
		else if(option==2)
		{
			double height=(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter perpindicular height")));
			double base=(Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the width of the base")));
			if(base>0&&height>0)
			{
				triangleNum=(0.5*(base*height));
				JOptionPane.showMessageDialog(null, "A triangle has a perpindicular height of "+height+" and a base of "+base+" it has an area of "+triangleNum);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Can't compute");
			}
		}

		System.exit(0);
	}

}
