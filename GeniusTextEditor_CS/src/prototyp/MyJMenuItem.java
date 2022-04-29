package prototyp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MyJMenuItem extends JMenuItem implements ActionListener {

	public MyJMenuItem() {
		this("");
	}
	
	public MyJMenuItem(String text) {
		super(text);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		
		switch(e.getActionCommand().toLowerCase()) {
		case "exit":{
			System.exit(0);
			break;
		}
		case "about":{
			JOptionPane.showMessageDialog(null, "Dies ist der About Dialog");
			break;
		}
		default:{
			System.out.println("Bitte was?");
		}
		}
		
	}
	
}
