package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Project1 {

	private JFrame frame;
	private JTextField textField;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmStandard;
	private JMenuItem mntmScientific;
	private JMenuItem mntmUnit;
	private JMenuItem mntmExit;
	private JButton btnNewButton_3;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnCos;
	private JButton btnCosh;
	private JButton btnInx;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton btnx;
	private JButton btnXy;
	private JButton btnTan;
	private JButton btnTanh;
	private JButton btnC_1;
	private JButton button6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton btnNewButton_7;
	private JButton btnX;
	private JButton btnCbr;
	private JButton btnRund;
	private JButton btnpi;
	private JButton button_10;
	private JButton button_11;
	private JButton btnNewButton_8;
	private JButton btnX_1;
	private JButton btnBin;
	private JButton btnHex;
	private JButton btnOc;
	private JButton btnCe;
	private JButton button_12;

	/**
	 * Launch the application.
	 */
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	double india=100;
	double usa=80;
	double japan=20;
	private JPanel panel;
	private JLabel lblCurrencyConvertor;
	private JTextField textField_1;
	private JButton btnConvert;
	private JButton btnClear;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project1 window = new Project1();
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
	public Project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(112, 0, 465, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 97, 19);
		frame.getContentPane().add(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmStandard = new JMenuItem("Scientific");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setBounds(100, 100, 608, 455);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
			}
		});
		mnFile.add(mntmStandard);
		
		mntmScientific = new JMenuItem("Standard");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 262, 455);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
			}
			
		});
		mnFile.add(mntmScientific);
		
		mntmUnit = new JMenuItem("Unit");
		mntmUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 813, 455);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
			}
		});
		mnFile.add(mntmUnit);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,
			            "Do you want to Exit ?", "Exit Confirmation : ",
			            JOptionPane.YES_NO_OPTION);
			        if (result == JOptionPane.YES_OPTION)
			        	System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JButton btnSine = new JButton("Sine");
		btnSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.sin(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnSine.setBounds(402, 47, 53, 33);
		frame.getContentPane().add(btnSine);
		
		JButton btnNewButton = new JButton("sinh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.sinh(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
				
			}
		});
		btnNewButton.setBounds(465, 48, 55, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("mod");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="mod";
			}
		});
		btnNewButton_1.setBounds(530, 49, 58, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.log(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnL.setBounds(339, 47, 53, 33);
		frame.getContentPane().add(btnL);
		
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1 = Double.parseDouble(btnSqrt.getText());
				double res=Math.sqrt(num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnSqrt.setBounds(264, 47, 67, 30);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnNewButton_2 = new JButton("+/-");
		btnNewButton_2.setBounds(198, 44, 56, 33);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(123, 44, 53, 33);
		frame.getContentPane().add(btnC);
		
		btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+btnNewButton_3.getText();
				textField.setText(Num1);
			}
		});
		btnNewButton_3.setBounds(6, 91, 52, 33);
		frame.getContentPane().add(btnNewButton_3);
		
		button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button.getText();
				textField.setText(Num1);
				
			}
		});
		button.setBounds(74, 91, 41, 33);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_1.getText();
				textField.setText(Num1);
			}
		});
		button_1.setBounds(135, 91, 41, 33);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("/");
		button_2.setBounds(188, 91, 41, 33);
		frame.getContentPane().add(button_2);
		
		btnNewButton_4 = new JButton("%");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=num1/100;
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnNewButton_4.setBounds(239, 91, 48, 33);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("pi");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=3.14*(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
				
			}
		});
		btnNewButton_5.setBounds(302, 91, 54, 33);
		frame.getContentPane().add(btnNewButton_5);
		
		btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.cos(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnCos.setBounds(366, 91, 53, 33);
		frame.getContentPane().add(btnCos);
		
		btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.cosh(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnCosh.setBounds(429, 91, 67, 33);
		frame.getContentPane().add(btnCosh);
		
		btnInx = new JButton("inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.log(num1)/10;
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnInx.setBounds(506, 91, 89, 33);
		frame.getContentPane().add(btnInx);
		
		button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_3.getText();
				textField.setText(Num1);
			}
		});
		button_3.setBounds(0, 132, 58, 33);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_4.getText();
				textField.setText(Num1);
			}
		});
		button_4.setBounds(74, 137, 41, 23);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_5.getText();
				textField.setText(Num1);
			}
			
		});
		button_5.setBounds(125, 137, 53, 23);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("*");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(188, 137, 41, 23);
		frame.getContentPane().add(button_6);
		
		btnx = new JButton("1/X");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=(1/num1);
				String ans=String.format("%.2f",res);
				textField.setText(ans);
			}
		});
		btnx.setBounds(237, 137, 53, 23);
		frame.getContentPane().add(btnx);
		
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
		btnXy.setBounds(303, 137, 53, 23);
		frame.getContentPane().add(btnXy);
		
		btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.tan(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnTan.setBounds(367, 137, 53, 23);
		frame.getContentPane().add(btnTan);
		
		btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.tanh(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnTanh.setBounds(429, 137, 57, 23);
		frame.getContentPane().add(btnTanh);
		
		btnC_1 = new JButton("C");
		btnC_1.setBounds(499, 135, 89, 23);
		frame.getContentPane().add(btnC_1);
		
		button6 = new JButton("1");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button6.getText();
				textField.setText(Num1);
			}
		});
		button6.setBounds(0, 176, 53, 23);
		frame.getContentPane().add(button6);
		
		button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_7.getText();
				textField.setText(Num1);
			}
		});
		button_7.setBounds(74, 166, 53, 33);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_8.getText();
				textField.setText(Num1);
			}
		});
		button_8.setBounds(135, 171, 57, 28);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_9.setBounds(198, 171, 58, 28);
		frame.getContentPane().add(button_9);
		
		btnNewButton_7 = new JButton("=");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="cbr")
				{
					result=(num1/num2)*100;
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
				if(op=="mod")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}

			}
		});
		btnNewButton_7.setBounds(261, 171, 75, 71);
		frame.getContentPane().add(btnNewButton_7);
		
		btnX = new JButton("X^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=num1*num1;
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnX.setBounds(339, 171, 53, 28);
		frame.getContentPane().add(btnX);
		
		btnCbr = new JButton("cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op="cbr";
			}
		});
		btnCbr.setBounds(402, 171, 53, 23);
		frame.getContentPane().add(btnCbr);
		
		btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=Math.round(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnRund.setBounds(465, 171, 67, 23);
		frame.getContentPane().add(btnRund);
		
		btnpi = new JButton("2*pi");
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=2*3.14*(num1);
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnpi.setBounds(530, 171, 58, 20);
		frame.getContentPane().add(btnpi);
		
		button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setBounds(0, 205, 75, 33);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton(".");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num1=textField.getText()+button_11.getText();
				textField.setText(Num1);
			}
		});
		button_11.setBounds(92, 210, 72, 28);
		frame.getContentPane().add(button_11);
		btnNewButton_8 = new JButton("+");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
			
		});
		btnNewButton_8.setBounds(189, 210, 65, 28);
		frame.getContentPane().add(btnNewButton_8);
		
		btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
				double res=num1*num1*num1;
				String ans=String.format("%.2f",res);
				textField.setText(String.valueOf(ans));
			}
		});
		btnX_1.setBounds(346, 210, 53, 28);
		frame.getContentPane().add(btnX_1);
		
		btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int res=num1;
				textField.setText(Integer.toBinaryString(res));
			}
		});
		btnBin.setBounds(412, 204, 58, 34);
		frame.getContentPane().add(btnBin);
		
		btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int res=num1;
				textField.setText(Integer.toHexString(res));
			}
		});
		btnHex.setBounds(475, 204, 57, 34);
		frame.getContentPane().add(btnHex);
		
		btnOc = new JButton("oc");
		btnOc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int res=num1;
				textField.setText(Integer.toOctalString(res));
			}
		});
		btnOc.setBounds(540, 205, 48, 33);
		frame.getContentPane().add(btnOc);
		
		btnCe = new JButton("CE");
		btnCe.setBounds(60, 47, 53, 28);
		frame.getContentPane().add(btnCe);
		
		button_12 = new JButton("<-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		button_12.setBounds(0, 42, 52, 33);
		frame.getContentPane().add(button_12);
		
		panel = new JPanel();
		panel.setBounds(598, 11, 198, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblCurrencyConvertor = new JLabel("Currency Convertor");
		lblCurrencyConvertor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		lblCurrencyConvertor.setBounds(10, 26, 188, 28);
		panel.add(lblCurrencyConvertor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "India", "Japan", "China", "Brezil", "Canada"}));
		comboBox.setBounds(33, 82, 82, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(29, 128, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(33, 176, 82, 38);
		panel.add(label);
		
		btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double bp = Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("India"));
				{
					String c=String.format("RS %.2f",bp*usa);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("USA"));
				{
					String c=String.format("RS %.2f",bp*usa);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("japan"));
				{
					String c=String.format("RS %.2f",bp*japan);
					label.setText(c);
				}
				}
		});
		btnConvert.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnConvert.setBounds(10, 220, 89, 23);
		panel.add(btnConvert);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnClear.setBounds(109, 221, 89, 23);
		panel.add(btnClear);
	}
}
