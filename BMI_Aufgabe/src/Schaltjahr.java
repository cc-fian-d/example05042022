import java.time.LocalDate;

import javax.swing.JOptionPane;

/**
 * 
 * Das Programm soll eine Jahreszahl abfragen und ausgeben ob es sich um dabei
 * um ein Schaltjahr handelt.
 * 
 * Wenn die Jahreszahl ohne rest durch 4 Teilbar ist, dann handelt es sich um
 * ein Schaltjahr.
 * 
 * Allerdings wenn die Jahreszahl ohne rest durch 100 Teilbar ist, dann handelt
 * sich um KEIN Schaltjahr
 * 
 * Sollte das Jahr allerdings ohne rest durch 400 Teilbar sein, dann ist das
 * Jahr ein Schaltjahr.
 *
 */
public class Schaltjahr {

	public static void main(String[] args) {
		String input = JOptionPane
				.showInputDialog("Bitte eine Jahreszahl eingeben.");
		int jahr = Integer.parseInt(input);

//		Musterloesung I
		
//		if((jahr %4 == 0) && (jahr %100 !=0)) {
//			System.out.println("Es ist ein Schaltjahr");
//		}else if((jahr %4 == 0) && (jahr %100 ==0) && (jahr % 400 ==0)){
//			System.out.println("Es ist ein Schaltjahr");
//		} else {
//			System.out.println("Es ist KEIN Schaltjahr");
//		}

//		Musterloesung II
		
//		if (jahr % 4 == 0) {
//			if (jahr % 100 == 0) {
//				if (jahr % 400 == 0) {
//					System.out.println("Es ist ein Schaltjahr");
//				} else {
//					System.out.println("Es ist KEIN Schaltjahr");
//				}
//			} else {
//				System.out.println("Es ist ein Schaltjahr");
//			}
//			
//		} else {
//			System.out.println("Es ist KEIN Schaltjahr");
//		}
		
//		Musterloesung III
		
//		if(jahr % 400 == 0) {
//			System.out.println("Es ist ein Schaltjahr");
//		} else if(jahr % 100 == 0) {
//			System.out.println("Es ist KEIN Schaltjahr");
//		} else if(jahr % 4 == 0) {
//			System.out.println("Es ist ein Schaltjahr");
//		} else {
//			System.out.println("Es ist KEIN Schaltjahr");
//		}
		
//		Musterloesung IV
		
		if(LocalDate.of(jahr, 1, 1).isLeapYear()) {
			JOptionPane.showMessageDialog(null, "Es ist ein Schaltjahr");
		} else{
			JOptionPane.showMessageDialog(null, "Es ist KEIN Schaltjahr");
		}
		
	}

}
