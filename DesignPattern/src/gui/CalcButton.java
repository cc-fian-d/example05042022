package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalcButton extends JButton{

	public CalcButton(String text) {
		super(text);
		
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MyLabel.getInstance().setText(getText());			
			}
		});
	}
	
}
