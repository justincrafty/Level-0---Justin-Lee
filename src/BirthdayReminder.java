 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "May 26th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bob = JOptionPane.showInputDialog("What birthday would you like to know?");
		// 3. Print out what the user typed
		System.out.println(bob);
		// 4. if user asked for "mom"
	if( bob .equalsIgnoreCase("mom") ){JOptionPane.showMessageDialog(null, momsBirthday);
			//print mom's birthday
		// 5. if user asked for "dad"
	if( bob .equalsIgnoreCase("dad") ){JOptionPane.showMessageDialog(null, dadsBirthday);
			// print dad's birthday
		// 6. if user asked for your name
	if( bob .equalsIgnoreCase("me") )JOptionPane.showMessageDialog(null, myBirthday);}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
	}}
