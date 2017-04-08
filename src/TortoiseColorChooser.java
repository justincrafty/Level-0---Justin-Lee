
// Copyright Wintriss Technical Schools 2013
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		for (int q = 0; q < 5; q++) {

			// 3. ask the user what color they would like the tortoise to draw
			String bob = JOptionPane.showInputDialog("What color would u like the tortoise to draw");
			// 4. use an if/else statement to set the pen color that the user
			// requested
			if (bob.equalsIgnoreCase("blue")) {
				Tortoise.setPenColor(Color.blue);
			}
			if (bob.equalsIgnoreCase("red")) {
				Tortoise.setPenColor(Color.red);
			}
			if (bob.equalsIgnoreCase("green")) {
				Tortoise.setPenColor(Color.green);
			}
			if (bob.equalsIgnoreCase("pink")) {
				Tortoise.setPenColor(Color.pink);
			}
			if (bob.equalsIgnoreCase("black")) {
				Tortoise.setPenColor(Color.black);
			}
			if (bob.equalsIgnoreCase("yellow")) {
				Tortoise.setPenColor(Color.yellow);
			}
			if (bob.equalsIgnoreCase("gray")) {
				Tortoise.setPenColor(Color.gray);
			}
			if (bob.equalsIgnoreCase("orange")) {
				Tortoise.setPenColor(Color.orange);
			}if (bob.equalsIgnoreCase("cyan")) {
				Tortoise.setPenColor(Color.cyan);
			}
			if (bob.equals("")) {
				Tortoise.setPenColor(Colors.getRandomColor());
			}
			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user
			// for
			// more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one
			// line
			// of code)
			for (int i = 0; i < 4; i++) {
				Tortoise.move(100);
				Tortoise.turn(90);
			}
		}
	}
}
