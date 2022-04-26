import java.io.File;

/**
 * 
 * Warum ist diese Klasse nicht gut formuliert?
 * 
 * SOLID-Prinzipien
 * 
 * Single-Responsibility-Prinzip
 *
 * https://de.wikipedia.org/wiki/Prinzipien_objektorientierten_Designs#SOLID-Prinzipien
 *
 * https://de.wikipedia.org/wiki/Single-Responsibility-Prinzip
 * 
 * 
 * Das Single-Responsibility-Prinzip besagt, dass jede Klasse nur eine einzige
 * Verantwortung haben solle. Verantwortung wird hierbei als �Grund zur
 * �nderung� definiert:
 * 
 * �There should never be more than one reason for a class to change.�
 * 
 * �Es sollte nie mehr als einen Grund daf�r geben, eine Klasse zu �ndern.�
 * 
 * � Robert C. Martin: Agile Software Development: Principles, Patterns, and
 * Practices[1]
 * 
 * Mehr als eine Verantwortung f�r eine Klasse f�hrt zu mehreren Bereichen, in
 * denen zuk�nftige �nderungen notwendig werden k�nnen. Die Wahrscheinlichkeit,
 * dass die Klasse zu einem sp�teren Zeitpunkt ge�ndert werden muss, steigt
 * zusammen mit dem Risiko, sich bei solchen �nderungen subtile Fehler
 * einzuhandeln. Dieses Prinzip f�hrt in der Regel zu Klassen mit hoher
 * Koh�sion, in denen alle Methoden einen starken gemeinsamen Bezug haben
 */
public class Schwein_BAD_OOP {

	public void stallBauen() {

	}

	public void loadFile(File file) {

	}

	public void save(String playerData) {

	}

	public void milchErzeugen() {

	}

	public void wolleErzeugen() {

	}

	public void eierLegen() {

	}

	public void laufen() {

	}

	public void fressen() {

	}
}
