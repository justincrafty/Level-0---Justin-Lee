import javax.swing.JOptionPane;

public class Ages {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("please enter you age");
		int bob = Integer.parseInt(age);
		for (int i = 1; i < bob + 1; i++) {
			System.out.println(i);
		}

	}
}
