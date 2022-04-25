package gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecondFrame extends JFrame {
	public SecondFrame() {
				this.setBounds(100, 100, 438, 223);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(1, 1, 0, 0));
		this.getContentPane().add(MyLabel.getInstance());
		
		this.setVisible(true);
	}
}
