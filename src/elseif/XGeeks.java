//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;


import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 
int x = JOptionPane.showOptionDialog(null, "Who's superpower do you want to know?", "", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Bill", "August", "Bob" },null);
if(x==3) {
	JOptionPane.showMessageDialog(null, "Bob's super power is he can fly.");
}
if(x==2) {
	JOptionPane.showMessageDialog(null, "August's super power is he can teleport.");
}
if(x==1) {
	JOptionPane.showMessageDialog(null, "Bill's super power is he can read minds.");
}
}
}

