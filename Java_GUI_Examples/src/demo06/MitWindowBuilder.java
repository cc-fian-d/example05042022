package demo06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;

public class MitWindowBuilder {

	private JFrame frmWindowsbuilder;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MitWindowBuilder window = new MitWindowBuilder();
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
	public MitWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWindowsbuilder = new JFrame();
		frmWindowsbuilder.setTitle("WindowsBuilder");
		frmWindowsbuilder.setBounds(100, 100, 640, 480);
		frmWindowsbuilder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindowsbuilder.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		frmWindowsbuilder.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 65));
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		frmWindowsbuilder.getContentPane().add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_16 = new MyFancyJButton("New button");
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new MyFancyJButton("New button");
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new MyFancyJButton("New button");
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new MyFancyJButton("New button");
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton = new MyFancyJButton("7");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new MyFancyJButton("8");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new MyFancyJButton("9");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_13 = new MyFancyJButton("-");
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_3 = new MyFancyJButton("4");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new MyFancyJButton("5");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new MyFancyJButton("6");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_14 = new MyFancyJButton("+");
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_6 = new MyFancyJButton("1");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new MyFancyJButton("2");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new MyFancyJButton("3");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_15 = new MyFancyJButton("*");
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_9 = new MyFancyJButton("0");
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new MyFancyJButton("-+");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new MyFancyJButton("del");
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new MyFancyJButton("/");
		panel_1.add(btnNewButton_12);
	}

}
