package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("This is my first gui");
		frame.setPreferredSize(new Dimension(400, 300));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		
		JLabel label = new JLabel("Hello Class");
		
//		JLabel img = new JLabel(new ImageIcon("C:\\Users\\DELL\\Downloads\\HtmlCss\\portfolio\\images\\icon.png"));
		
		JTextField txt = new JTextField(4);
		JLabel result = new JLabel();
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						String val = txt.getText();
						try {
							int x = Integer.parseInt(val);
							int value = x*x*x;
							result.setText("Result: "+value);
						}catch(Exception e1) {
							System.out.println(e1);
						}
					}
			}
		);
		
		frame.pack();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
//		panel.add(img);
		panel.add(txt);
		panel.add(calc);
		panel.add(result);
	}

}