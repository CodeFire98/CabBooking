import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuBar;

public class Profile {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile window = new Profile();
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
	public Profile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBookCab = new JLabel("Book Cab");
		lblBookCab.setFont(new Font("Arial", Font.BOLD, 25));
		lblBookCab.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookCab.setBounds(282, 114, 429, 54);
		frame.getContentPane().add(lblBookCab);
		
		JLabel lblAvailableBalance = new JLabel("Available Balance");
		lblAvailableBalance.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAvailableBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvailableBalance.setBounds(811, 10, 165, 32);
		frame.getContentPane().add(lblAvailableBalance);
		
		JLabel lblBalDisp = new JLabel("000.00");
		lblBalDisp.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalDisp.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBalDisp.setBackground(Color.WHITE);
		lblBalDisp.setBounds(845, 35, 96, 32);
		frame.getContentPane().add(lblBalDisp);
		
		JLabel lblPickup = new JLabel("Pick-up");
		lblPickup.setHorizontalAlignment(SwingConstants.CENTER);
		lblPickup.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPickup.setBounds(219, 194, 129, 40);
		frame.getContentPane().add(lblPickup);
		
		JLabel lblDrop = new JLabel("Drop");
		lblDrop.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrop.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDrop.setBounds(221, 260, 127, 40);
		frame.getContentPane().add(lblDrop);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(358, 194, 285, 40);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(360, 257, 283, 40);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnBookMyCab = new JButton("Book my Cab!");
		btnBookMyCab.setFont(new Font("Arial", Font.BOLD, 16));
		btnBookMyCab.setBounds(398, 336, 210, 54);
		frame.getContentPane().add(btnBookMyCab);
		
		JLabel lblNotEnoughMoney = new JLabel("Not enough money?");
		lblNotEnoughMoney.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNotEnoughMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotEnoughMoney.setBounds(628, 507, 147, 32);
		frame.getContentPane().add(lblNotEnoughMoney);
		
		JButton btnAddMoney = new JButton("Add Money (+300)");
		btnAddMoney.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAddMoney.setBounds(785, 507, 169, 32);
		frame.getContentPane().add(btnAddMoney);
		
		JLabel lblWelcome = new JLabel("Welcome,");
		lblWelcome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblWelcome.setBounds(10, 35, 112, 24);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblname = new JLabel("//Name");
		lblname.setFont(new Font("Arial", Font.PLAIN, 20));
		lblname.setBounds(132, 37, 182, 24);
		frame.getContentPane().add(lblname);
	}
}
