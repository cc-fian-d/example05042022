package prototyp01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Quizmaster2022_III {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quizmaster2022_III window = new Quizmaster2022_III();
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
	public Quizmaster2022_III() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(310, 379, 227, 80);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(547, 379, 227, 80);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(310, 470, 227, 80);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBounds(547, 470, 227, 80);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 106, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUnvollstndigesBeispiel = new JLabel("Unvollst\u00E4ndiges Beispiel");
		lblUnvollstndigesBeispiel.setBounds(10, 40, 172, 30);
		frame.getContentPane().add(lblUnvollstndigesBeispiel);
		
		JLabel lblUnvollstndigesBeispiel_1 = new JLabel("Unvollst\u00E4ndiges Beispiel");
		lblUnvollstndigesBeispiel_1.setBounds(10, 73, 172, 30);
		frame.getContentPane().add(lblUnvollstndigesBeispiel_1);
		
		JLabel lblUnvollstndigesBeispiel_2 = new JLabel("Unvollst\u00E4ndiges Beispiel");
		lblUnvollstndigesBeispiel_2.setBounds(10, 106, 172, 30);
		frame.getContentPane().add(lblUnvollstndigesBeispiel_2);
		
		JLabel lblUnvollstndigesBeispiel_3 = new JLabel("Unvollst\u00E4ndiges Beispiel");
		lblUnvollstndigesBeispiel_3.setBounds(10, 136, 172, 30);
		frame.getContentPane().add(lblUnvollstndigesBeispiel_3);
		
		JLabel lblUnvollstndigesBeispiel_4 = new JLabel("Unvollst\u00E4ndiges Beispiel");
		lblUnvollstndigesBeispiel_4.setBounds(10, 167, 172, 30);
		frame.getContentPane().add(lblUnvollstndigesBeispiel_4);
		
		JLabel lblUnvollstndigesBeispiel_5 = new JLabel("Unvollst\u00E4ndiges Beispiel");
		lblUnvollstndigesBeispiel_5.setBounds(10, 201, 172, 30);
		frame.getContentPane().add(lblUnvollstndigesBeispiel_5);
	}
}
