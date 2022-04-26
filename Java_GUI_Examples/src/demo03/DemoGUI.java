package demo03;

import javax.swing.JFrame;

public class DemoGUI {

	public static void main(String[] args) {
//		JFrame frame01 = new JFrame("Frame01");
//		JFrame frame02 = new JFrame("Frame02");
//		JFrame frame03 = new JFrame("Frame03");
//		JFrame frame04 = new JFrame("Frame04");
//		
//		frame01.setBounds(Resolution.VGA.getRect());
//		frame02.setBounds(Resolution.SVGA.getRect());
//		frame03.setBounds(Resolution.FULLHD.getRect());
//		frame04.setBounds(Resolution.UHD.getRect());
//		
//		frame01.setVisible(true);
//		frame02.setVisible(true);
//		frame03.setVisible(true);
//		frame04.setVisible(true);
		
		for(Resolution res : Resolution.values()) {
			JFrame frame = new JFrame("Frame : " + res.name());
			frame.setBounds(res.getRect());
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		}
		
		
	}

}
