package prototyp;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Aufgabe dieser Klasse ist die Erstellung/Darstellung der GUI.
 * 
 *
 */
public class Prototyp01 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prototyp01 window = new Prototyp01();
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
	public Prototyp01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel pnlEast = new JPanel();
		pnlEast.setBackground(Color.ORANGE);
		frame.getContentPane().add(pnlEast, BorderLayout.EAST);
		pnlEast.setLayout(new GridLayout(13, 1, 0, 0));

		JLabel lblNewLabel = new JLabel("Font Setting");
		pnlEast.add(lblNewLabel);

		JButton btnNewButton = new JButton("Font ++");
		pnlEast.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Font --");
		pnlEast.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Set Font");
		pnlEast.add(btnNewButton_2);

		textField = new JTextField();
		textField.setText("42");
		pnlEast.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_3 = new JButton("Reset Font");
		pnlEast.add(btnNewButton_3);

		JLabel lblNewLabel_1 = new JLabel("Alignment");
		pnlEast.add(lblNewLabel_1);

		JButton btnNewButton_4 = new JButton("Center");
		pnlEast.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Left");
		pnlEast.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Right");
		pnlEast.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Block");
		pnlEast.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("Word Wrap");
		pnlEast.add(btnNewButton_8);

		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(255, 204, 153));
		frame.getContentPane().add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		pnlCenter.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setHorizontalAlignment(SwingConstants.TRAILING);
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("File load");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("File save");
		mnNewMenu.add(mntmNewMenuItem_1);

		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);

		JMenu mnNewMenu_1 = new JMenu("Import");
		mnNewMenu.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("CSV");
		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("XML");
		mnNewMenu_1.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Export ...");
		mnNewMenu.add(mntmNewMenuItem_3);

		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_4);

		JMenu mnNewMenu_2 = new JMenu("Edit");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("search");
		mnNewMenu_2.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("replace");
		mnNewMenu_2.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("delete all");
		mnNewMenu_2.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("undo");
		mnNewMenu_2.add(mntmNewMenuItem_9);

		JMenu mnNewMenu_3 = new JMenu("View");
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Small");
		mnNewMenu_3.add(mntmNewMenuItem_11);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Large");
		mnNewMenu_3.add(mntmNewMenuItem_10);

		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem(
				"Light Mode");
		mnNewMenu_3.add(rdbtnmntmNewRadioItem);

		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem(
				"Dark Mode");
		mnNewMenu_3.add(rdbtnmntmNewRadioItem_1);

		JMenu mnNewMenu_4 = new JMenu("Tools");
		mnNewMenu_4.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_16 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_16);

		JMenuItem mntmNewMenuItem_17 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_17);

		JMenuItem mntmNewMenuItem_18 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_18);

		JMenuItem mntmNewMenuItem_19 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_19);

		JMenuItem mntmNewMenuItem_20 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_20);

		JMenuItem mntmNewMenuItem_21 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_21);

		JMenuItem mntmNewMenuItem_22 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_22);

		Component horizontalGlue = Box.createHorizontalGlue();
		menuBar.add(horizontalGlue);

		JMenu mnNewMenu_5 = new JMenu("Help");
		menuBar.add(mnNewMenu_5);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("find Plugin");
		mnNewMenu_5.add(mntmNewMenuItem_12);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("what is ... ?");
		mnNewMenu_5.add(mntmNewMenuItem_13);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Example JSON");
		mnNewMenu_5.add(mntmNewMenuItem_14);

		JMenuItem mntmNewMenuItem_15 = new JMenuItem("about");

		mnNewMenu_5.add(mntmNewMenuItem_15);
	}
}
