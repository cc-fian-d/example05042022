package prototyp;

import java.awt.Component;

import javax.swing.JOptionPane;

public class JavaDialoge {

	public static void main(String[] args) {

		/**
		 * JOptionPane
		 */
		
		/**
		 * showMessageDialog(Component parentComponent,Object message);
		 * 
		 * parentComponet darf null sein.
		 * 
		 * message ist häufig ein String
		 */
		JOptionPane.showMessageDialog(null, "Hallo Welt hier ist Java");
		
		
		/**
		 * showMessageDialog(Component parentComponent,Object message, String title, int messageType) 
		 * 
		 * showMessageDialog(Component parentComponent,Object message, String title, int messageType, Icon icon)
		 */
		JOptionPane.showMessageDialog(null, "Nachricht", "Ich bin der Titel", JOptionPane.QUESTION_MESSAGE);
		
		String title = "Genius TextEditor FIAN 320581 Gruppe 2";
		String message = "Ein Übungsprojekt für die Umschulung / Ausbildung\nzum Fachinformatiker Anwendungsentwicklung";
		
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
		
		
		/**
		 * showConfirmDialog(Component parentComponent, Object message, String title, int optionType)
		 */
		int result = -1;
		while(result<0) {
			result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION);
			System.out.println("Rückgabe ist " + result);
		}
		result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.OK_CANCEL_OPTION);
		System.out.println("Rückgabe ist " + result);
		result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.OK_OPTION);
		System.out.println("Rückgabe ist " + result);
		
		
		/**
		 * showInputDialog
		 * 
		 * showInputDialog(Object message, Object initialSelectionValue) 
		 */
		String name = JOptionPane.showInputDialog("Wie heißen Sie", "Wilhemine Musterfrau");
		
		JOptionPane.showMessageDialog(null, name,"Hallo",JOptionPane.PLAIN_MESSAGE);
		
	}

}
