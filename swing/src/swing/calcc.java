package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class calcc {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnx;
	private JButton button;
	private JButton btnExp;
	private JButton btnCos;
	private JButton btnXy;
	private JButton btnX;
	private JButton btnLn;
	private JButton btnTan;
	private JButton btnN;
	private JButton button_1;
	private JButton btnSec;
	private JPanel panel;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton btnNewButton_1;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton button_12;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	private JPanel panel_1;
	private JLabel lblEdit;
	private JLabel lblView;
	private JLabel lblHelp;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcc window = new calcc();
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
	public calcc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 523, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 19, 475, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.sqrt(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnSqrt.setBounds(0, 78, 61, 39);
		frame.getContentPane().add(btnSqrt);
		
		btnNewButton = new JButton("sine");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.sin(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnNewButton.setBounds(136, 78, 67, 39);
		frame.getContentPane().add(btnNewButton);
		
		btnx = new JButton("1/x");
		btnx.setBounds(67, 78, 59, 39);
		frame.getContentPane().add(btnx);
		
		button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=num1*100;
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		button.setBounds(0, 139, 61, 31);
		frame.getContentPane().add(button);
		
		btnExp = new JButton("EXP");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double expo=Double.parseDouble(textField.getText());
				double res=Math.pow(num1, expo);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
				 
			}
		});
		btnExp.setBounds(67, 143, 61, 27);
		frame.getContentPane().add(btnExp);
		
		btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.cos(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnCos.setBounds(136, 135, 67, 31);
		frame.getContentPane().add(btnCos);
		
		btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double num2 = Double.parseDouble(textField.getText());
				double res=Math.pow(num1,num2);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
				
			}
		});
		btnXy.setBounds(0, 181, 67, 23);
		frame.getContentPane().add(btnXy);
		
		btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=num1*num1;
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnX.setBounds(0, 215, 67, 23);
		frame.getContentPane().add(btnX);
		
		btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.log(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnLn.setBounds(67, 181, 74, 23);
		frame.getContentPane().add(btnLn);
		
		btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.cos(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnTan.setBounds(156, 181, 61, 23);
		frame.getContentPane().add(btnTan);
		
		btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnN.setBounds(77, 215, 67, 23);
		frame.getContentPane().add(btnN);
		
		button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_1.getText();
				textField.setText(Num1);

			}
		});
		button_1.setBounds(240, 82, 49, 31);
		frame.getContentPane().add(button_1);
		
		btnSec = new JButton("Sec");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.cos(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnSec.setBounds(156, 215, 61, 23);
		frame.getContentPane().add(btnSec);
		
		panel = new JPanel();
		panel.setBounds(0, 57, 230, 239);
		frame.getContentPane().add(panel);
		
		button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_2.getText();
				textField.setText(Num1);
				
			}
		});
		button_2.setBounds(313, 82, 49, 31);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_3.getText();
				textField.setText(Num1);
			}
		});
		button_3.setBounds(375, 82, 49, 31);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_4.getText();
				textField.setText(Num1);
			}
		});
		button_4.setBounds(254, 139, 49, 31);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_5.getText();
				textField.setText(Num1);
			}
		});
		button_5.setBounds(313, 139, 49, 31);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_6.getText();
				textField.setText(Num1);
			}
		});
		button_6.setBounds(375, 141, 49, 27);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_7.getText();
				textField.setText(Num1);
			}
		});
		button_7.setToolTipText("7");
		button_7.setBounds(254, 181, 49, 23);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_8.getText();
				textField.setText(Num1);
			}
		});
		button_8.setBounds(313, 177, 49, 27);
		frame.getContentPane().add(button_8);
		
		btnNewButton_1 = new JButton("3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_9.getText();
				textField.setText(Num1);
			}
			
		});
		btnNewButton_1.setBounds(373, 181, 49, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_9.getText();
				textField.setText(Num1);
			}
		});
		button_9.setBounds(252, 215, 49, 23);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setBounds(313, 215, 49, 23);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("=");
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

			}
		});
		button_11.setBounds(375, 215, 45, 23);
		frame.getContentPane().add(button_11);
		
		btnNewButton_2 = new JButton("/");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		btnNewButton_2.setBounds(436, 87, 49, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("*");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
			
		});
		btnNewButton_3.setBounds(436, 141, 49, 27);
		frame.getContentPane().add(btnNewButton_3);
		
		button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_12.setBounds(442, 181, 43, 23);
		frame.getContentPane().add(button_12);
		
		btnNewButton_4 = new JButton("+");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton_4.setBounds(442, 215, 43, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		panel_1 = new JPanel();
		panel_1.setBounds(250, 61, 235, 235);
		frame.getContentPane().add(panel_1);
		
		lblEdit = new JLabel("Edit");
		lblEdit.setBounds(20, -6, 46, 27);
		frame.getContentPane().add(lblEdit);
		
		lblView = new JLabel("view");
		lblView.setBounds(80, -6, 46, 23);
		frame.getContentPane().add(lblView);
		
		lblHelp = new JLabel("Help");
		lblHelp.setBounds(136, 0, 46, 14);
		frame.getContentPane().add(lblHelp);
	}

}
