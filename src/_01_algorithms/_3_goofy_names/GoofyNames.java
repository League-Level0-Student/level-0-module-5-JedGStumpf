package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

//import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
//		JFrame frame = new JFrame("");
//		frame.setSize(0, 0);
//		frame.setLocationRelativeTo(null);
//		frame.setVisible(true);
		
		String prompt = "Enter Your Name";
		String name = JOptionPane.showInputDialog(prompt);
		// 1. Ask the user to enter their name

		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		System.out.println(name.toUpperCase());
//		char toAdd;
		for (int x = 0; x< name.length(); x++) {
			char next = name.charAt(x);
			if (name.charAt(x) == ' ') {
				goofyName += ' ';
			} else if (x % 2 == 1) {
				goofyName += Character.toLowerCase(next);
			} else {
				goofyName += Character.toUpperCase(next);
			}
//			goofyName += toAdd;
			
		}
		
		JOptionPane.showMessageDialog(null, goofyName);
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.

				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
	
				
				// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
			
				// 7. ADD the char to the end of the goofyName String

		
		// 8. Use pop-up to show user their Goofy name

	}
}

