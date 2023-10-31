package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient {
	static Robot rob = new Robot();
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("");
		frame.setSize(1000, 1000);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		rob.miniaturize();
		rob.show();
		rob.penDown();
		rob.setSpeed(100);
		
//		Color red = new Color.red();
//		Color blue = new Color.bluel();
		String red = "red";
		String blue = "blue";
		String green = "green";
		
		String choice = JOptionPane.showInputDialog("Choose a Color: red, blue, green");
		if (choice.toLowerCase().startsWith("r")) {
				rob.setPenColor(Color.red);
		} else if (choice.toLowerCase().startsWith("b")) {
			rob.setPenColor(Color.blue);
		} else if (choice.toLowerCase().startsWith("g")) {
			rob.setPenColor(Color.green);
		} else {
			rob.setRandomPenColor();
			JOptionPane.showMessageDialog(frame, choice + " is not on the list, setting pen color to Random");
		}
		boolean shapeChoice = false;
		
		while (!shapeChoice) {
			String shape = JOptionPane.showInputDialog("Choose a shape: square, triangle, circle");
			if (shape.toLowerCase().startsWith("s")) {
				drawSquare();
				shapeChoice = true;
			} else if (shape.toLowerCase().startsWith("t")) {
				drawTriangle();
				shapeChoice = true;
			} else if (shape.toLowerCase().startsWith("c")) {
				drawCircle();
				shapeChoice = true;
			} else {
				continue;
			}
		}

		
	}
	

	public static void drawTriangle() {
		
		for (int x = 0; x < 3; x++) {
			rob.move(100);
			rob.turn(120);
		}

	}
	
	public static void drawSquare() {
		for (int x = 0; x < 4; x++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	
	public static void drawCircle() {
		for (int x = 0; x < 360; x++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}	

