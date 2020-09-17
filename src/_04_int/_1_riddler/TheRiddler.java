package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog(null, "how many mexicans does it take to screw in a lightbulb");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals("juan")) {
	JOptionPane.showMessageDialog(null, "correct");
	score = score+1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong, it was juan");
}
		// 6. Add some more riddles
JOptionPane.showInputDialog("What is greater than God,\r\n" + 
		"more evil than the devil,\r\n" + 
		"the poor have it,\r\n" + 
		"the rich need it,\r\n" + 
		"and if you eat it, you'll die?");
if(riddle.equals("nothing")) {
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "correct");
		score = score+1;
	}
else {
	JOptionPane.showMessageDialog(null, "wrong, it was nothing");
}
	}
}
	

