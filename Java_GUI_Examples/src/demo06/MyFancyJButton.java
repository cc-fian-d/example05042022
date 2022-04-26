package demo06;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class MyFancyJButton extends JButton {

	public MyFancyJButton() {
		this("");
	}
	
	public MyFancyJButton(String text) {
		super(text);
		this.setFont(new Font("Trebuchet MS", Font.ITALIC, 24));
		this.setBackground(Color.BLUE);
		this.setForeground(Color.WHITE);
	}
	
	
}
