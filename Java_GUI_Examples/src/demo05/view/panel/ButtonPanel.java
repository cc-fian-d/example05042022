package demo05.view.panel;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	public ButtonPanel() {
		this(new String[] { "m", "m+", "m-", "mc", "7", "8", "9", "-", "4", "5",
				"6", "*", "1", "2", "3", "/", "0", "-+", "del", "+" });
	}

	public ButtonPanel(String... commands) {
		// 12 Elemente
		// 4 Zeilen zu 3 Spalten

		this.setLayout(new GridLayout(0, 4, 3, 3));

		for (String t : commands) {
			this.add(new JButton(t));
		}

	}

}
