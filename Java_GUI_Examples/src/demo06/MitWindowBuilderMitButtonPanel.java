package demo06;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import demo05.view.panel.ButtonPanel;
import demo05.view.panel.DisplayPanel;

public class MitWindowBuilderMitButtonPanel {

	private JFrame frmWindowsbuilder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MitWindowBuilderMitButtonPanel window = new MitWindowBuilderMitButtonPanel();
					window.frmWindowsbuilder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MitWindowBuilderMitButtonPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWindowsbuilder = new JFrame();
		frmWindowsbuilder.setTitle("WindowsBuilder zergliedert");
		frmWindowsbuilder.setBounds(100, 100, 640, 480);
		frmWindowsbuilder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindowsbuilder.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new DisplayPanel();
		panel.setBackground(Color.CYAN);
		frmWindowsbuilder.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new ButtonPanel();
		panel_1.setBackground(Color.ORANGE);
		frmWindowsbuilder.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		
	}

}
