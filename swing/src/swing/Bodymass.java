package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bodymass {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	double num1;
	double num2;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bodymass window = new Bodymass();
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
	public Bodymass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(22, 21, 397, 37);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setBounds(139, 5, 119, 19);
		lblBodyMassIndex.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(22, 69, 397, 232);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWeight = new JLabel("Weight((kg)");
		lblWeight.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblWeight.setBounds(25, 93, 79, 14);
		panel_1.add(lblWeight);
		
		JLabel lblHeightm = new JLabel("Height(m)");
		lblHeightm.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblHeightm.setBounds(25, 54, 54, 14);
		panel_1.add(lblHeightm);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBmi.setBounds(25, 137, 46, 14);
		panel_1.add(lblBmi);
		
		textField = new JTextField();
		textField.setBounds(115, 51, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 90, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(115, 138, 46, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(201, 126, 128, 14);
		panel_1.add(label_1);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(298, 126, 46, 14);
		panel_1.add(label_3);
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				double res=(num2/(num1*num1));
				String ans=String.format("%.2f",res);
				label.setText(ans);
				if(res<18.5)
				{
					label_1.setText("Under Weight");
				}
				else if(res>=18.5 && res<=24.9)
				{
					label_1.setText("Normal Weight");

				}
				else if(res>=25 && res<=29.9)
				{
					label_1.setText("over Weight");

				}
				else
				{
					label_1.setText("obese");

				}
				

			}
		});
		btnCalculate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCalculate.setBounds(63, 177, 111, 23);
		panel_1.add(btnCalculate);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				label.setText(null);
				label_1.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnClear.setBounds(184, 177, 89, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnExit.setBounds(283, 177, 89, 23);
		panel_1.add(btnExit);
		
				
		JLabel label_2 = new JLabel("");
		label_2.setBounds(115, 138, 46, 14);
		panel_1.add(label_2);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(22, 323, 397, 162);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton(new ImageIcon("C://Users/USER/Pictures/chart.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(10, 11, 387, 140);
		panel_2.add(btnNewButton);
	}
}
