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

public class DiceGame2
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
			int sum=0;
			for(int i=0;i<5;i++)
			{
				sum+=dices[i].value();
			}
			
			JOptionPane.showMessageDialog(null,"You're five dice contains: "+"\n"+ D+"\nThese dice have a total score of "+sum);
			
			option=JOptionPane.showInputDialog(null,"Do you want to roll again, roll or quit");
			if(option.equals("quit"))
			{
				System.exit(0);
			}
			if(!option.equals("roll")&&(!option.equals("quit")))
			{
				JOptionPane.showMessageDialog(null, D);
			}
		boolean checked=true;
		int count=0;
		while(option.equals("roll"))
			{	
				option=JOptionPane.showInputDialog(null,"Which dice would you like to roll again 1,2,3,4,5 or quit");
				switch(option)
				{
				case "quit": System.exit(0);
				break;
					
				case "1":dices[0]=new Dice();
				break;
				
				case "2":dices[1]=new Dice();
				break;
				
				case "3":dices[2]=new Dice();
				break;
				
				case "4":dices[3]=new Dice();
				break;
				
				case "5":dices[4]=new Dice();
				break;
				
				default: System.exit(0);
				}
				
				StringBuffer D2 = new StringBuffer();
				for(int i=0;i<5;i++)
				{
					D2.append(Integer.toString((dices[i].value()))+"\n");
				}
				int sum2=0;
				int sum3=sum2;
				for(int i=0;i<5;i++)
				{
					sum2+=dices[i].value();
				}
				if(sum2>sum&&checked==true)
				{
					JOptionPane.showMessageDialog(null,"You're five dice contains: "+"\n"+D2+"\nThese dice have a total score of "+sum2);
					checked=false;
				}
				else if(checked==true&&sum2<sum)
				{
					JOptionPane.showMessageDialog(null,"You're five dice contains: "+"\n"+D2+"\nThese dice have a total score of "+sum2+"\nYou have failed to increase your total score"+"\nYou made "+count+" successful rolls");
					System.exit(0);
				}
				else if(sum2>sum3&&checked==false)
				{
					JOptionPane.showMessageDialog(null,"You're five dice contains: "+"\n"+D2+"\nThese dice have a total score of "+sum2);
				}
				else if(sum3>sum2&&checked==false)
				{
					JOptionPane.showMessageDialog(null,"You're five dice contains: "+"\n"+D2+"\nThese dice have a total score of "+sum2+"\nYou have failed to increase your total score"+"\nYou made "+count+" successful rolls");
					System.exit(0);
				}
				count++;
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