package _01_algorithms._1_prime_or_not;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class prime_or_not {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("");
		frame.setSize(0, 0);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		String prompt = "Enter a number";
		
		int input = Integer.parseInt(JOptionPane.showInputDialog(prompt));
		
		is_prime(input);
		
		
		
	}
	
	public static void is_prime(int number) {
		int oldNumber = number;
		boolean primeBool = false;
		if (number % 2 == 1) {
//			int oldNumber = number;
			number += 1;
			
		} else {
			
		}
		
		int primeCount = 0;
		for (int x = 2; x <= number/2; x++) {
			if (oldNumber % x == 0) {
//				System.out.println(primeBool);
//				primeBool = true;
				primeCount += 1;
			} 
		}
		
		if (primeCount == 0) {
			primeBool = true;
		}
		
		System.out.println(Integer.toString(oldNumber) + " is " + String.valueOf(primeBool));
	}
	
	
}
