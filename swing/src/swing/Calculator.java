package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 * 
	 */
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 486, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(68, 29, 234, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.setBackground(Color.CYAN);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(71, 83, 50, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBackground(Color.CYAN);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setForeground(Color.BLUE);
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBounds(131, 82, 50, 43);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBackground(Color.CYAN);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setForeground(Color.BLUE);
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_2.setBounds(191, 82, 50, 43);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBackground(Color.CYAN);
		button_3.setForeground(Color.BLUE);
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_3.setBounds(71, 136, 50, 51);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBackground(Color.CYAN);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_4.getText();
				textField.setText(Number);
			}
		});
		button_4.setForeground(Color.BLUE);
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_4.setBounds(131, 136, 50, 51);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBackground(Color.CYAN);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setForeground(Color.BLUE);
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_5.setBounds(191, 136, 55, 51);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBackground(Color.CYAN);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setForeground(Color.BLUE);
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_6.setBounds(71, 198, 50, 49);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBackground(Color.CYAN);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setForeground(Color.BLUE);
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_7.setBounds(131, 198, 50, 49);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBackground(Color.CYAN);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setForeground(Color.BLUE);
		button_8.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		button_8.setBounds(191, 198, 50, 50);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setBackground(Color.CYAN);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setForeground(Color.BLUE);
		button_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_9.setBounds(71, 267, 50, 47);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_10.setBackground(Color.CYAN);
		button_10.setForeground(Color.BLUE);
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_10.setBounds(131, 267, 50, 47);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.setBackground(Color.CYAN);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				
			}
		});
		button_11.setForeground(Color.BLUE);
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_11.setBounds(191, 267, 50, 47);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setBackground(Color.CYAN);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		button_12.setForeground(Color.RED);
		button_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_12.setBounds(251, 82, 55, 43);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_13.setBackground(Color.CYAN);
		button_13.setForeground(Color.RED);
		button_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_13.setBounds(256, 136, 55, 56);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.setBackground(Color.CYAN);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_14.setForeground(Color.RED);
		button_14.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_14.setBounds(257, 198, 55, 49);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.setBackground(Color.CYAN);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		button_15.setForeground(Color.BLUE);
		button_15.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_15.setBounds(251, 267, 55, 47);
		frame.getContentPane().add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC.setBackground(Color.GREEN);
		btnC.setForeground(Color.BLUE);
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnC.setBounds(71, 336, 50, 47);
		frame.getContentPane().add(btnC);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					b=strB.toString();
					textField.setText(b);
				}
			}
		});
		btnB.setBackground(Color.GREEN);
		btnB.setForeground(Color.BLUE);
		btnB.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnB.setBounds(131, 336, 50, 47);
		frame.getContentPane().add(btnB);
		
		JButton button_16 = new JButton("%");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_16.setBackground(Color.GREEN);
		button_16.setForeground(Color.BLUE);
		button_16.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_16.setBounds(191, 336, 50, 47);
		frame.getContentPane().add(button_16);
	}

}
