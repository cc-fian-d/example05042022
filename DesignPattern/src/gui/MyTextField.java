package gui;

import javax.swing.JTextField;

public class MyTextField extends JTextField{

	private static MyTextField INSTANCE;
	
	public static MyTextField getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new MyTextField();
		}
		return INSTANCE;
	}
	
	private MyTextField() {
		this.setFont(getFont().deriveFont(24f));
	}
}
