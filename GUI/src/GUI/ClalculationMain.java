package GUI;

import javax.swing.*;

public class ClalculationMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CalcPanel panel = new CalcPanel();
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);

	}

}
