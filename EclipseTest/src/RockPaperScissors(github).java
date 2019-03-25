import javax.swing.JOptionPane;


public class RockPaperScissors {
	public static void main (String [] arg){
		
		/*get user input for r, p, or s
		 * Player one picks R, P, or S and is stored in playerOne
		 * Player two picks R, P, or S and is stored in playerTwo
		 * if playerOne picks a thing that is greater than playerTwo then they win
		 * vice versa
		 * set r > s
		 * set p > r
		 * set s > p
		 * print winner
		 */
		
		
		String rock;
		String paper;
		String scissors;
		String playerOneName;
		String playerTwoName;
		int playerOne;
		String p1Hand;
		int playerTwo;
		String p2Hand;
		String result;
		String winner = null;
	
		rock = "rock";
		paper = "paper";
		scissors = "scissors";
		String[] options = {rock , paper, scissors}; // this created an array that will later be used as the options.
		// the next two lines gets the Players' names
		playerOneName = JOptionPane.showInputDialog("Enter your name Player 1");
		playerTwoName = JOptionPane.showInputDialog("Enter your name Player 2");
		
		// the next 8 lines assigns whatever Player 1 and 2 enters into the int values player(One/Two).
		// the options in the option box are numbered from left to right starting with 0.
		playerOne = JOptionPane.showOptionDialog
		(null, "Choose your hand", playerOneName,
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
				null , options, options[0]); 
			p1Hand = Integer.toString(playerOne);
		playerTwo = JOptionPane.showOptionDialog
		(null, "Choose your hand", playerTwoName,
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
				null , options, options[0]);
			p2Hand = Integer.toString(playerTwo);
			
		/* the way this works is it sets whatever the players input and convert it to a string
		 * with the 'toString' thingy (not sure what terminology to use lol). Them the two inputs
		 * are concatenated and a result is shown. If player one plays rock (1) and player two
		 * plays paper (2), the program will concatenate them together to make 12. This value
		 * is a string literal, not an integer. I set the string 12 equal to player two winning 
		 * because that's how the game works.
		 */
			result = (p1Hand + p2Hand);
		if ((result).equals("01")){
			winner = playerTwoName;
		}
		if ((result).equals("02")){
			winner = playerOneName;
		}
		if ((result).equals("10")){
			winner = playerOneName;
		}
		if ((result).equals("12")){
			winner = playerTwoName;
		}
		if ((result).equals("20")){
			winner = playerTwoName;
		}
		if ((result).equals("21")){
			winner = playerOneName;
		}
		JOptionPane.showMessageDialog (null, "Congrats, " + winner + " wins!");
			
			/* below is a longer version that I didn't like. I didn't a program one that re-makes
			 * the entire message based on the outcome. I wanted the message itself to be final and to 
			 * change only one part of it (as I've done above.)
	
			 
			if ((result).equals("01")){
				JOptionPane.showMessageDialog(null, "Congrats, " + playerTwoName + " wins!");
				}
			if ((result).equals("02")){
				JOptionPane.showMessageDialog(null, "Congrats, " + playerOneName + " wins!");
				}
			if ((result).equals("10")){
				JOptionPane.showMessageDialog(null, "Congrats, " + playerOneName + " wins!");
				}
			if ((result).equals("12")){
				JOptionPane.showMessageDialog(null, "Congrats!, " + playerTwoName + " wins!");
				}
			if ((result).equals("20")){
				JOptionPane.showMessageDialog(null, "Congrats, " + playerTwoName + " wins!");
				}
			if ((result).equals("21")){
				JOptionPane.showMessageDialog(null, "Congrats, " + playerOneName + " wins!");
				}
		
		//JOptionPane.showMessageDialog(null, result);
		
		//if (playerOne > playerTwo)
			//JOptionPane.showMessageDialog(null, "Congrats, " + playerOneName + " wins!");		
				
/*Object[] option = { "peell", "CANCEL" };

JOptionPane.showOptionDialog
(null, "Click OK to continue", "Warning",
JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
null, option, option[0]);

if(selected == JOptionPane.NO_OPTION)   continue;
if(selected == JOptionPane.CANCEL_OPTION)   throw new UnavailableException();
if(selected == JOptionPane.YES_OPTION){
    ...
		*/
		
		
	}

}
