package prototyp01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Quizmaster2022 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quizmaster2022 window = new Quizmaster2022();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quizmaster2022() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		panel.setPreferredSize(new Dimension(170, 10));
		panel.setMinimumSize(new Dimension(250, 10));
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		panel.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 153));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 0, 3, 3));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 153));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(5, 5));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setPreferredSize(new Dimension(10, 50));
		panel_2.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(lblNewLabel_12);
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(0, 1, 3, 3));
		
		JLabel lblNewLabel_13 = new JLabel("Hier soll die Frage stehen");
		panel_7.add(lblNewLabel_13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 153, 153));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(5, 5));
		
		JPanel panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(10, 50));
		panel_3.add(panel_5, BorderLayout.NORTH);
		panel_5.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_5.add(btnNewButton_2);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(2, 2, 5, 5));
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_6.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_6.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_6.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_6.add(btnNewButton_6);
	}

}
