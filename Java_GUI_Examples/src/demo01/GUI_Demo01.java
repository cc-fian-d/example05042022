package demo01;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GUI_Demo01 {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();

		/**
		 * Bitte daran denken die defaultCloseOperation zu konfigurieren
		 * 
		 * 
		 * 
		 * @JFrame.DO_NOTHING_ON_CLOSE Standard - bedeutet der Frame unternimmt
		 *                             nichts wenn er geschlossen wird.
		 * 
		 * @JFrame.DISPOSE_ON_CLOSE Wenn mehr als ein Frame erzeugt wird und
		 *                          beendet werden, beendet sich das Programm
		 *                          erst wenn der letzte Frame geschlossen wurde
		 * 
		 * @JFrame.EXIT_ON_CLOSE Das Programm wird mit dem Schliessen des Frames
		 *                       beendet
		 * 
		 * @JFrame.HIDE_ON_CLOSE Der Frame wird unsichtbar geschaltet.
		 * 
		 */
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * Titel des Fensters
		 */
		mainFrame.setTitle("Ich bin eine GUI DEMO");

		/**
		 * Festlegen der Größe des Frames
		 */
//		mainFrame.setSize(640, 480);
//		Dimension dimVGA = new Dimension(640, 480);
//		mainFrame.setSize(dimVGA);

		/**
		 * Festlegen der Größe und Position des Frames
		 */
//		mainFrame.setBounds(150, 150,640,480);

		Dimension dimVGA = new Dimension(640, 480);
		Point point = new Point(125, 125);

		Rectangle rect = new Rectangle(point, dimVGA);

		mainFrame.setBounds(rect);

		mainFrame.setVisible(true);
	}

}
