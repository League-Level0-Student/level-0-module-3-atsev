//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(1000000)+1;
		// 2. Print out the random variable above
		
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		for (int i = 0; i < 21; i++) {
			
		
String x = JOptionPane.showInputDialog("Guess a number between 1 and 100.");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
int b = Integer.parseInt(x);
			// 5. if the guess is correct
if (b==random) {
	JOptionPane.showMessageDialog(null, "Correct!");
	break;
}
if (b>random) {
	JOptionPane.showMessageDialog(null, "Too high");
}
if (b<random) {
	JOptionPane.showMessageDialog(null, "Too low");
}
}
}
}

				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose
	




