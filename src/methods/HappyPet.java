//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package methods;

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.

	public static void main(String[] args) {
		int happy = 0;
		// 1. Ask the user what kind of pet they want to buy, and store in variable
JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i <6; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "spend time with", "feed", "play" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (task == 0) {
	happy++;
JOptionPane.showMessageDialog(null, "Your pet is happy that you spent time with it.");	
}
if (task == 1) {
	happy++;
JOptionPane.showMessageDialog(null, "Your pet is happy that you fed it.");	
}
if (task == 2) {
	happy++;
JOptionPane.showMessageDialog(null, "Your pet is happy that you played with it.");	
}
if (happy == 5) {
JOptionPane.showMessageDialog(null, "Your pet loves you and does not need any more attention!");
break;
}
}
}
}
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
