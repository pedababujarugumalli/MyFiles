package add;

import javax.swing.JOptionPane;

public class upsc{
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"hello"+name);
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"your are "+age+" years old");
	}
	
}
