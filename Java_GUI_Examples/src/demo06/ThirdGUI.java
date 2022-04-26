package demo06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ThirdGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThirdGUI frame = new ThirdGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThirdGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		this.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("7");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_13 = new JButton("-");
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_3 = new JButton("4");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_14 = new JButton("+");
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_6 = new JButton("1");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_15 = new JButton("*");
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_9 = new JButton("0");
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("-+");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("del");
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		panel_1.add(btnNewButton_12);
	}

}
