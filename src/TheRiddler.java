import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int bob = 0;
		// 3. As;k the user a riddle. Here are some ideas: bit.ly/some-riddles
String ans = JOptionPane.showInputDialog("You will always find me in the past. I can be created in the present, But the future can never taint me. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(ans.equalsIgnoreCase ("history") ){ 
	JOptionPane.showMessageDialog(null, "Correct");  
	bob = bob + 1;} else {JOptionPane.showMessageDialog(null, "Wrong");}
		// 5. Otherwise, say "wrong" and tell them the answer
JOptionPane.showMessageDialog(null, "Your score is"+bob);
		// 6. Add some more riddles
String and = JOptionPane.showInputDialog("What is harder to catch the faster you run?");
if(and.equalsIgnoreCase("Your Breath")  ){ 
	JOptionPane.showMessageDialog(null, "Correct");  
	bob = bob + 1;} else {JOptionPane.showMessageDialog(null, "Wrong");}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is"+bob);
	}
}

