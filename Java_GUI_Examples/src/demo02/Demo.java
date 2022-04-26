package demo02;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class Demo {

	public static void main(String[] args) {
		Dimension dim = new Dimension(800, 600);
		Point point = new Point(125, 125);
		Rectangle rect = new Rectangle(point, dim);
		
		
		JFrame frame01 = new JFrame("Frame 01");
		JFrame frame02 = new JFrame("Frame 02");
		JFrame frame03 = new JFrame("Frame 03");
		JFrame frame04 = new JFrame("Frame 04");
		
		frame01.setBounds(rect);
		frame02.setBounds(rect);
		frame03.setBounds(rect);
		frame04.setBounds(rect);
		
		frame01.setVisible(true);
		frame02.setVisible(true);
		frame03.setVisible(true);
		frame04.setVisible(true);
		
	}

}
