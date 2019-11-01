package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class Sample {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Page");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		frame.setBounds(100, 100, 550, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnLogout = new JButton(new ImageIcon("C://Users/USER/Pictures/looo.jpg"));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setForeground(Color.RED);
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnLogout.setBounds(221, 237, 116, 120);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblUsername.setBounds(47, 62, 102, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setBounds(47, 105, 71, 14);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember me");
		chckbxRememberMe.setBounds(159, 160, 116, 23);
		frame.getContentPane().add(chckbxRememberMe);
		
		JButton btnRegister = new JButton(new ImageIcon("C://Users/USER/Pictures/rrr.jpg"));
		btnRegister.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setBounds(35, 237, 136, 120);
		frame.getContentPane().add(btnRegister);
		
		textField = new JPasswordField();
		textField.setBounds(159, 104, 116, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 61, 116, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
