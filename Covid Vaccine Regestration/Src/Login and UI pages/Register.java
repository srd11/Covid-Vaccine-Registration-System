import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

//import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	JTextField textField;
	private ButtonGroup br= new ButtonGroup();
     JTextField textField_1;
    String gender;
	private JTextField textField_2;
	String phoneno1;
	Connection con=null;
	String name;
	String yearofbirth;
	String number;
	public static String nm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register for Vaccination");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setBounds(345, 0, 253, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(237, 215, 92, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();

				if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
				{
					textField.setEditable(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please enter only alphabets");
				}
			}
		});
		textField.setBounds(381, 213, 247, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String d=textField.getText();
		System.out.print(d);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(237, 266, 69, 21);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				gender = "Male";
			}
		});
		rdbtnNewRadioButton.setBounds(381, 267, 69, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				gender = "Female";
			}
		});
		rdbtnNewRadioButton_1.setBounds(473, 267, 69, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		rdbtnNewRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			  gender = "Other";
			}
		});
		rdbtnNewRadioButton_2.setBounds(563, 267, 76, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		br.add(rdbtnNewRadioButton_2);
		br.add(rdbtnNewRadioButton);
		br.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel(" Year of Birth");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(237, 321, 105, 19);
		contentPane.add(lblNewLabel_3);
		
		/*
		 * 	JButton button = new JButton("Select File");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button) {
					JFileChooser filechooser = new JFileChooser();
					//int response =filechooser.showOpenDialog(null);
					int response =filechooser.showSaveDialog(null);
					
					if(response ==JFileChooser.APPROVE_OPTION) {
						File selectedFile =new File(filechooser.getSelectedFile().getAbsolutePath());
						// dir.setText(c.getCurrentDirectory().toString());
						
						
						 /* try {
					            String fileName = selectedFile.getCanonicalPath();
					            if (!fileName.endsWith(EXTENSION)) {
					                selectedFile = new File(fileName + EXTENSION);
					            }
					            ImageIO.write(image, FORMAT_NAME, selectedFile);
					        } catch (IOException e) {
					            e.printStackTrace();
					        }////////
						
					}
				}
			}
		});

		 */
		
		DefaultListModel d1 = new 	DefaultListModel();
		d1.addElement("Aadhar Card");
		d1.addElement("PAN Card");
		d1.addElement("");
		//spinner.add(lblNewLabel_4);
		
		JList list = new JList();
		list.setBounds(89, 260, 24, 19);
		contentPane.add(list);
		
		String[] optionsToChoose = {"Aadhar Card", "Driving license", "Pan Card"};
		
		JLabel lblNewLabel_5 = new JLabel("Aadhar Id");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(237, 371, 92, 24);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke)
			{
				String phno=textField_1.getText();
				int length=phno.length();
				char c=ke.getKeyChar();

				if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
				{
					if(length<12)
					{
						textField_1.setEditable(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter only 12 digit id");
					}
				}
			}
		});
		textField_1.setBounds(381, 371, 247, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Click Here To Register!");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = textField.getText();
			    yearofbirth=textField_2.getText();
				number = textField_1.getText();
				
				
				 nm= name;
				
				
				
				certificate_ui c = new certificate_ui();
				c.name1.setText(name);
				
				//String Idproof = (String) comboBox.getItemAt(comboBox.getSelectedIndex());
				//Login l = new Login();
				//String phoneno="8975335789";
				//String phoneno1 = l.number;
				
				//place p = new place();
				//p.textField.setText(phoneno1);
				

				
				
				
				
				
		
				JavaMySQLConnection jv  = new JavaMySQLConnection();
				boolean result=jv.getData(name,gender,yearofbirth,number);
				if(result)
				{
					JOptionPane.showMessageDialog(null, "Registration done successfully ....");
					place p = new place();
					p.textField.setText(name);
					p.textField_1.setText(number);
					//p.textField_2.setText(number);
					
					p.show();
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Can not insert the data..");
				}
				
				
			}
				
				
				
				
				
		
				  
				
			
		});
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(257, 461, 391, 34);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke)
			{
				String phno=textField_2.getText();
				int length=phno.length();
				char c=ke.getKeyChar();

				if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
				{
					if(length<4)
					{
						textField_2.setEditable(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter only 4 digit");
					}
				}
			}});

		textField_2.setBounds(381, 319, 247, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\Desktop\\photo.JPG"));
		lblNewLabel_6.setBounds(85, 57, 720, 128);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("                                          Note: Enter your 12 digit adhar card number for photo id verification");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(257, 406, 548, 27);
		contentPane.add(lblNewLabel_4);
		
		
	}
}
