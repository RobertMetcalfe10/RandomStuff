package practical7;

import javax.swing.JOptionPane;

//objects from this class will represent
	// six-sided dice.

	 class Dice {

	    private int faceValue;

	    // mutator method for the dice class

	    public void roll() {
	       faceValue = 1 + (int)(Math.random()*6.0);
	    }

	    // the accessor method for the dice

	    public int value(){
	       return faceValue;
	    }

	   // the constructor for dice objects.  Starts them
	   // with a roll.
	   
	   public Dice(){
	      roll();
	   }

	} // end of the Dice class

public class DiceGame
{
		public static void main(String[] args)
		{
			StringBuffer D=new StringBuffer();
			String option="";
			Dice[] dices=new Dice[5];
			
			for(int i=0; i<5;i++)
			{
				dices[i]=new Dice();
			}
			for(int i=0;i<5;i++)
			{
				D.append(Integer.toString((dices[i].value()))+"\n");
			}
			JOptionPane.showMessageDialog(null,"You're five dice contains: "+"\n"+ D);
			String hold=D.toString();
			option=JOptionPane.showInputDialog(null,"Do you want to roll again, roll or quit");
			if(option.equals("quit"))
			{
				System.exit(0);
			}
			if(!option.equals("roll")&&(!option.equals("quit")))
			{
				JOptionPane.showMessageDialog(null, D);
			}
			while(option.equals("roll"))
			{
				for(int i=0; i<5;i++)
				{
					dices[i]=new Dice();
				}
				
				StringBuffer D2 = new StringBuffer();
				for(int i=0;i<5;i++)
				{
					D2.append(Integer.toString((dices[i].value()))+"\n");
				}
				JOptionPane.showMessageDialog(null,"You're five dice contains: "+"\n"+D2);
				option=JOptionPane.showInputDialog(null,"Do you want to roll again, roll or quit");
				
				if(option.equals("quit"))
				{
					System.exit(0);
				}
				if(!option.equals("roll")&&(!option.equals("quit")))
				{
					JOptionPane.showMessageDialog(null, D2);
				}
				
			}
		}
}