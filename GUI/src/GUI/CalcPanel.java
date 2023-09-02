package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalcPanel extends JPanel{
	JLabel label, result;
	JButton btnF, btnC;
	JTextField txt;
	
	public CalcPanel() {
		label = new JLabel("Enter a Number");
		txt = new JTextField(5);
		btnF = new JButton("Calc Factorial");
		btnC = new JButton("Calc Cube");
		result = new JLabel("Result: ");
		
		btnC.addActionListener = new ActionListener(CubeListener());
		btnF.addActionListener(new ActionListener(FactListener()));
		
		add(label);
		add(txt);
		add(btnF);
		add(btnC);
		add(result);
		
		setPreferredSize(new Dimension(400,500));
	}
	
	public int CalcCube(int x) {
		return x*x*x;
	}
	
	public int CalcFact(int x) {
		int fact=1;
		for(int i=0; i<=x; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public class CubeListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String str = txt.getText();
			try {
				int val = Integer.parseInt(str);
				int res = CalcCube(val);
				result.setText("Result: "+res);
			}catch(NumberFormatException e1) {
				result.setText("Error: "+e1);
			}
		}
	}
	
	public class FactListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String str = txt.getText();
			try {
				int val = Integer.parseInt(str);
				int res = CalcFact(val);
				result.setText("Result: "+res);
			}catch(NumberFormatException e1) {
				result.setText("Error: "+e1);
			}
		}
	}
}
