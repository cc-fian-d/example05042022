package demo04;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoPanel {

	public static void main(String[] args) {
		/**
		 * Frame als Fenster der Anwendung
		 */
		JFrame frame = new JFrame("Dies ist eine GUI Demo");
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * Panel um die Komponenten der Anwendung darzustellen
		 */
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);

		/**
		 * Komponenten auf dem Panel binden
		 */
		panel.add(new JButton("Ich bin ein Button"));
		panel.add(new JButton("Ich bin ein Button"));
		panel.add(new JButton("Ich bin ein Button"));
		panel.add(new JButton("Ich bin ein Button"));
		/**
		 * Panel an den Frame binden.
		 */
//		frame.add(panel);
		/**
		 * Nun hat der Frame 2 Panels
		 * 
		 * 1. contentPane des Frames wird bei der Erzeugung des Frames mit einen
		 * JPanel versehen.
		 * 
		 * 2. Das Erzeugte JPanel aus Zeile 21 wird mit der Zeile 35
		 * hinzugefügt.
		 */
		/**
		 * Wenn wir das contentPane ersetzen möchten dann müssen wir den Setter
		 * dafür verwenden.
		 * 
		 * 
		 */
		frame.setContentPane(panel);
		/**
		 * Durch das Auskommentieren der Zeile 35 und das setzen des
		 * contentPanes in Zeile 51 hat der Frame nur 1 Panel
		 */

		/**
		 * als letztes den Frame sichtbar schalten
		 */
		frame.setVisible(true);
	}

}
