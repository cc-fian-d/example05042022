package gui;

import javax.swing.JLabel;

public class MyLabel extends JLabel {

	private static MyLabel INSTANCE;
	
	public static MyLabel getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new MyLabel();
		}
		return INSTANCE;
	}
	
	private MyLabel() {
		this.setText("Ich bin das Label");
		this.setFont(getFont().deriveFont(24f));
	}
	
	
}
