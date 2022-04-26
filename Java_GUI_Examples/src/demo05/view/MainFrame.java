package demo05.view;

import javax.swing.JFrame;

import demo05.view.panel.MainPanel;

public class MainFrame extends JFrame{

	public MainFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 640, 480);
		this.setTitle("Dies ist eine GUI Demo");
		
		this.setContentPane(new MainPanel());
		
		this.setVisible(true);
	}
	
}
