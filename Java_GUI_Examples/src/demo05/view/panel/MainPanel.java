package demo05.view.panel;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {

	public MainPanel() {
		this.setLayout(new GridLayout(0, 1));
		this.add(new DisplayPanel());
		this.add(new ButtonPanel());

	}
	
}
