package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;zs

public class Project2 {

private JFrame frmStudentDetails;
private JTable table;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;
private JTextField textField_9;
private JTextField textField_10;
private JTextField textField_11;
private JTextField textField_12;
private JTextField textField_13;
private JTextField textField_3;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Project2 window = new Project2();
window.frmStudentDetails.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public Project2() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frmStudentDetails = new JFrame();
frmStudentDetails.setTitle("Student Details");
frmStudentDetails.getContentPane().setBackground(Color.BLUE);
frmStudentDetails.setBounds(100, 100, 815, 486);
frmStudentDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmStudentDetails.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student report", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel.setBounds(365, 0, 434, 258);
frmStudentDetails.getContentPane().add(panel);
panel.setLayout(null);

JButton btnClear = new JButton("Clear");
btnClear.setBounds(176, 224, 89, 23);
panel.add(btnClear);

JPanel panel_1 = new JPanel();
panel_1.setBackground(Color.GRAY);
panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
panel_1.setBounds(0, 0, 355, 258);
frmStudentDetails.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblStudentid = new JLabel("Student-ID");
lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 11));
lblStudentid.setBounds(26, 31, 68, 14);
panel_1.add(lblStudentid);

textField = new JTextField();
textField.setBounds(97, 28, 86, 20);
panel_1.add(textField);
textField.setColumns(10);

JLabel lblFirstName = new JLabel("First name");
lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
lblFirstName.setBounds(26, 68, 68, 14);
panel_1.add(lblFirstName);

textField_1 = new JTextField();
textField_1.setBounds(97, 65, 86, 20);
panel_1.add(textField_1);
textField_1.setColumns(10);

JLabel lblSurname = new JLabel("Surname");
lblSurname.setFont(new Font("Tahoma", Font.BOLD, 11));
lblSurname.setBounds(26, 104, 56, 14);
panel_1.add(lblSurname);

textField_2 = new JTextField();
textField_2.setBounds(97, 101, 86, 20);
panel_1.add(textField_2);
textField_2.setColumns(10);

JLabel lblTotalScore = new JLabel("Total score");
lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
lblTotalScore.setBounds(26, 183, 68, 14);
panel_1.add(lblTotalScore);

JSeparator separator = new JSeparator();
separator.setBounds(10, 170, 173, 2);
panel_1.add(separator);

JLabel lblAverage = new JLabel("Average");
lblAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
lblAverage.setBounds(26, 208, 68, 14);
panel_1.add(lblAverage);

textField_4 = new JTextField();
textField_4.setBounds(97, 205, 86, 20);
panel_1.add(textField_4);
textField_4.setColumns(10);

JLabel lblRanking = new JLabel("Ranking");
lblRanking.setFont(new Font("Tahoma", Font.BOLD, 11));
lblRanking.setBounds(26, 233, 46, 14);
panel_1.add(lblRanking);

textField_5 = new JTextField();
textField_5.setBounds(97, 230, 86, 20);
panel_1.add(textField_5);
textField_5.setColumns(10);

JLabel lblCourseCode = new JLabel("Course code");
lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 11));
lblCourseCode.setBounds(26, 145, 86, 14);
panel_1.add(lblCourseCode);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"301", "302", "303", "304", "305", "306"}));
comboBox.setBounds(97, 142, 86, 20);
panel_1.add(comboBox);
JLabel lblMaths = new JLabel("Maths");
lblMaths.setFont(new Font("Tahoma", Font.BOLD, 11));
lblMaths.setBounds(202, 31, 46, 14);
panel_1.add(lblMaths);
JLabel lblEnglish = new JLabel("English");
lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 11));
lblEnglish.setBounds(202, 68, 46, 14);
panel_1.add(lblEnglish);
JLabel lblBiology = new JLabel("Biology");
lblBiology.setFont(new Font("Tahoma", Font.BOLD, 11));
lblBiology.setBounds(202, 95, 46, 14);
panel_1.add(lblBiology);
JLabel lblComputer = new JLabel("Computer");
lblComputer.setFont(new Font("Tahoma", Font.BOLD, 11));
lblComputer.setBounds(204, 120, 62, 14);
panel_1.add(lblComputer);
JLabel lblChemistry = new JLabel("Chemistry");
lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 11));
lblChemistry.setBounds(202, 145, 68, 14);
panel_1.add(lblChemistry);
JLabel lblPhysics = new JLabel("Physics");
lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 11));
lblPhysics.setBounds(202, 183, 46, 14);
panel_1.add(lblPhysics);
JLabel lblTamil = new JLabel("Tamil");
lblTamil.setFont(new Font("Tahoma", Font.BOLD, 11));
lblTamil.setBounds(202, 208, 46, 14);
panel_1.add(lblTamil);
JLabel lblMalayalam = new JLabel("Malayalam");
lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 11));
lblMalayalam.setBounds(193, 233, 73, 14);
panel_1.add(lblMalayalam);
textField_6 = new JTextField();
textField_6.addKeyListener(new KeyAdapter() {
	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
});
panel_1.add(textField_6);
textField_6.setColumns(10);
textField_7 = new JTextField();
textField_7.setBounds(259, 65, 86, 20);
panel_1.add(textField_7);
textField_7.setColumns(10);
textField_8 = new JTextField();
textField_8.setBounds(259, 92, 86, 20);
panel_1.add(textField_8);
textField_8.setColumns(10);
textField_9 = new JTextField();
textField_9.setBounds(269, 117, 76, 20);
panel_1.add(textField_9);
textField_9.setColumns(10);

JPanel panel_2 = new JPanel();
panel_2.setBackground(Color.LIGHT_GRAY);
panel_2.setBounds(10, 264, 779, 94);
frmStudentDetails.getContentPane().add(panel_2);
panel_2.setLayout(null);

table = new JTable();
table.setBackground(Color.LIGHT_GRAY);
table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
table.setModel(new DefaultTableModel(
new Object[][] {
{"Student_ID", "Course_Nmae", "Maths", "English", "Biology","Computer","Chemistry","Physics","Tamil","Malayalam","Total Score","Average","Ranking"},
},
new String[] {
"Student_ID", "Course_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"
}
));
table.setCellSelectionEnabled(true);
table.setColumnSelectionAllowed(true);
table.setBounds(0, 0, 779, 94);
panel_2.add(table);

JButton btnNewButton = new JButton(" Add report");
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
}
});
btnNewButton.setBounds(26, 384, 97, 23);
frmStudentDetails.getContentPane().add(btnNewButton);

JButton btnNewButton_1 = new JButton("Delete");
btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
btnNewButton_1.setBounds(166, 384, 89, 23);
frmStudentDetails.getContentPane().add(btnNewButton_1);

JButton btnNewButton_2 = new JButton("Show report");
btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
btnNewButton_2.setBounds(312, 384, 107, 23);
frmStudentDetails.getContentPane().add(btnNewButton_2);


JButton btnNewButton_3 = new JButton("Exit");
btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
btnNewButton_3.setBounds(457, 384, 89, 23);
frmStudentDetails.getContentPane().add(btnNewButton_3);

JButton btnNewButton_4 = new JButton("Reset");
btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
btnNewButton_4.setBounds(625, 384, 89, 23);
frmStudentDetails.getContentPane().add(btnNewButton_4);
}
}
