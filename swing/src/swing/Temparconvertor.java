package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temparconvertor {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temparconvertor window = new Temparconvertor();
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
	public Temparconvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setBounds(98, 95, 46, 14);
		frame.getContentPane().add(lblDegrees);
		
		textField = new JTextField();
		textField.setBounds(149, 92, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(98, 164, 46, 14);
		frame.getContentPane().add(lblResult);
		
		JLabel label = new JLabel("");
		label.setBounds(149, 164, 86, 14);
		frame.getContentPane().add(label);
		
		JButton btnToCelsius = new JButton("To Celsius");
		btnToCelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=((num1-32)*5/9);
				String ans=String.format("%.2f",res);
				label.setText(ans);
			}
		});
		btnToCelsius.setBounds(95, 236, 89, 23);
		frame.getContentPane().add(btnToCelsius);
		
		JButton btnToFaranheat = new JButton("To Faranheat");
		btnToFaranheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=((num1*9/5)+32);
				String ans=String.format("%.2f",res);
				label.setText(ans);
			}
			
		});
		btnToFaranheat.setBounds(220, 236, 128, 23);
		frame.getContentPane().add(btnToFaranheat);
	}

}
