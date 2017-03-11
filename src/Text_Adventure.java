import java.util.Scanner;

import javax.swing.JOptionPane;

public class Text_Adventure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ans = input.nextLine();
		System.out.println(
				"You are an archealogist studying Ancient Egypt. You are getting of a plane in Cairo. Do you want ot get something to eat, or go to the dig sit?");
		String a = input.nextLine();
		if (a.equalsIgnoreCase("get something to eat")) {
			System.out.println("You get bitten by a cobra on the way to the restaurant and die 5 min later. ");
		}
		ans = input.nextLine();	
		if (a.equalsIgnoreCase("go to dig site")) {
			System.out.println(
					"You head to the dig site, and find out that you can go to either a tomb of one of the Egyptian Pharoahs, or go to the ruins of a village. Which one do you want to go to?");
			ans = input.nextLine();
		}
		ans = input.nextLine();	
		if (ans.equalsIgnoreCase("Pharoah's Tomb")) {
			System.out.println(
					"You go to the tomb and enter the pyramid. You walk into a dark room. There are two doors. Which one do you go through, the right, or the left.");
			ans = input.nextLine();
		}
		ans = input.nextLine();
		if (ans.equalsIgnoreCase("ruins of village")) {
			System.out.println(
					"You are at the ruins, but you step on a sharp piece of pottery. The cut becomes infected, and you die in an hour.");
		}
		ans = input.nextLine();

		if (ans.equalsIgnoreCase("right")) {
			
			System.out.println("You fall into a pit, and a fire ignites, you blow up.");
		}
		ans = input.nextLine();
		if (ans.equalsIgnoreCase("left")) {
			System.out.println(
					"You enter another room, with Pharoahs painted on the wall, you see a mummy sit up from its sarphagus, fight or flight?");
		}
		ans = input.nextLine();
		if (ans.equalsIgnoreCase("fight")) {
			System.out.println(
					"You grab a knife from the wall, and atempt to fight the mummy, however it sucks your life force out before you can do anything");
		}
		ans = input.nextLine();
		if (ans.equalsIgnoreCase(
				"You run out of the tomb. however bandits show up and put you in a jeep. Then they sacrfice you to their gods.")) {
		}
	}
}
