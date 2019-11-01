package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class teamproject3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField sub;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamproject3 window = new teamproject3();
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
	public teamproject3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 785, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(380, 50, 379, 285);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBox_2.setBounds(249, 194, 85, 20);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new String[] {
						textField_4.getText(),
						textField_9.getText(),
						textField_5.getText(),
						textField_6.getText(),
						(String)comboBox_2.getSelectedItem(),
						textField_8.getText(),
						textField_7.getText(),
						textField_11.getText(),
						textField_10.getText()
				});
			}
		});
		btnConfirm.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnConfirm.setBounds(134, 239, 142, 23);
		panel_1.add(btnConfirm);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(22, 24, 46, 14);
		panel_1.add(lblName_1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(22, 61, 46, 14);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(22, 97, 46, 14);
		panel_1.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(22, 137, 46, 14);
		panel_1.add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(22, 172, 46, 14);
		panel_1.add(lblTime);
		
		textField_4 = new JTextField();
		textField_4.setBounds(78, 21, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(78, 58, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(78, 94, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(78, 134, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(78, 169, 86, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setBounds(230, 97, 46, 14);
		panel_1.add(lblTicketNo);
		
		textField_9 = new JTextField();
		textField_9.setBounds(283, 94, 86, 20);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(230, 137, 46, 14);
		panel_1.add(lblPrice);
		
		textField_10 = new JTextField();
		textField_10.setBounds(283, 134, 86, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(230, 175, 46, 14);
		panel_1.add(lblRoute);
		
		textField_11 = new JTextField();
		textField_11.setBounds(283, 169, 86, 20);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 346, 739, 95);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name","Booking No", "From","To","No of Seats","Time","Date","AC/Non AC","Price"},
			},
			new String[] {
					"Name","Booking No", "From","To","No of Seats","Time","Date","AC/Non AC","Price"
			}
		));
		table.setBounds(21, 11, 689, 73);
		panel_2.add(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(4, 124, 366, 2);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(176, 6, 366, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		lblTicketBooking.setBounds(97, 11, 172, 14);
		panel.add(lblTicketBooking);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(10, 87, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(84, 85, 129, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setBounds(20, 133, 76, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton sin = new JRadioButton("Single ticket");
		sin.setBounds(98, 133, 94, 23);
		frame.getContentPane().add(sin);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(193, 133, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First class");
		rdbtnFirstClass.setBounds(20, 164, 94, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(125, 164, 67, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(193, 164, 109, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"From", "Arunachal Pradesh", "Himachel Pradesh", "Madhya Pradesh"}));
		comboBox.setBounds(20, 194, 87, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"To", "Kerala", "Andra pradesh", "Chandigarh", "Tamil nadu", "Arunachal predesh"}));
		comboBox_1.setBounds(135, 194, 102, 20);
		frame.getContentPane().add(comboBox_1);
		
		
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(10, 242, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(10, 267, 46, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 292, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 242, 86, 14);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 290, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		sub = new JTextField();
		sub.setBounds(66, 267, 86, 17);
		frame.getContentPane().add(sub);
		sub.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 225, 350, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num;
				String s="";
				num=1325;
				s=s+num+1325;
				textField_9.setText(s);
				textField_11.setText("Any");
				
				double t=0;
				String m="";
				if(sin.isSelected())
				{
			t=t+500;
				}
				else
				{
					t=t+300;
				}
				if(rdbtnSleeper.isSelected())
				{
				t=t+500;
				}
				else
				{
				t=t+300;
				}
				m=m+t;
				sub.setText(m);
				double[]R=new double[15];
				R[0]=Double.parseDouble(textField_1.getText());
				R[1]=Double.parseDouble(sub.getText());
				R[2]=Double.parseDouble((String) comboBox_2.getSelectedItem());
				R[3]=((R[2]*R[0]+R[1]));
				String total=String.format("%.2f",R[3]);
				textField_2.setText(total);
				String Name=textField.getText();
				textField_4.setText(Name);
				//String type=(String) rdbtnNewRadioButton.getSelectedItem();

				String from=(String) comboBox.getSelectedItem();
				textField_5.setText(from);
				String to=(String) comboBox_1.getSelectedItem();
				textField_6.setText(to);
				String price=textField_2.getText();
				textField_10.setText(price);
				 Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_8.setText(tTime.format(timer.getTime()));
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField_7.setText(tdate.format(timer.getTime()));
	                
				
				
			}
		});
		btnTotal.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnTotal.setBounds(20, 315, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
			}
		});
		btnReset.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnReset.setBounds(125, 315, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,
			            "Do you want to Exit ?", "Exit Confirmation : ",
			            JOptionPane.YES_NO_OPTION);
			        if (result == JOptionPane.YES_OPTION)
			        	System.exit(0);
			}
		});
		btnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnExit.setBounds(231, 315, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
