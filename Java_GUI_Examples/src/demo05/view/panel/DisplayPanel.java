package demo05.view.panel;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayPanel extends JPanel{

	public DisplayPanel() {
		this.setLayout(new GridLayout(0,1));
		this.add(new JTextField(25));
	}
	
}
