package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Weightconvertor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	double num1;
	double num2;
	double result1;
	double result2;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Weightconvertor window = new Weightconvertor();
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
	public Weightconvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblHeight.setBounds(104, 92, 46, 14);
		frame.getContentPane().add(lblHeight);
		
		textField = new JTextField();
		textField.setBounds(165, 89, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblWeight.setBounds(104, 133, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 130, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		

		JLabel label = new JLabel("");
		label.setBounds(282, 92, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(282, 133, 46, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				result1=num1/3.371;
				result2=num2/2.215;
				ans=String.format("%.2f",result1);
				label.setText(ans);
				ans=String.format("%.2f",result2);
				label_1.setText(ans);
				
			}
		});
		btnOk.setFont(new Font("Traditional Arabic", Font.BOLD, 12));
		btnOk.setBounds(165, 181, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);

			}
		});
		btnCancel.setFont(new Font("Traditional Arabic", Font.BOLD, 12));
		btnCancel.setBounds(263, 181, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblUsMeasurment = new JLabel("US Measurment");
		lblUsMeasurment.setBounds(165, 58, 86, 14);
		frame.getContentPane().add(lblUsMeasurment);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setBounds(282, 58, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(10, 22, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(57, 22, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblHeightAndWeiht = new JLabel("\t\t\t\t\tHeight and Weight convertor");
		lblHeightAndWeiht.setBackground(Color.CYAN);
		lblHeightAndWeiht.setForeground(Color.RED);
		lblHeightAndWeiht.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblHeightAndWeiht.setBounds(95, 0, 339, 20);
		frame.getContentPane().add(lblHeightAndWeiht);
		
	}
}
