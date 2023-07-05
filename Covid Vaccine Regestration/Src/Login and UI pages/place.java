import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Label;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;

public class place extends JFrame {

	private JPanel contentPane;
	String phoneno;
	JTextField textField;
	 JTextField textField_1;
	JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					place frame = new place();
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
	public place() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Place");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(376, 156, 113, 37);
		contentPane.add(lblNewLabel);
		
		String[] optionsToChoose = {"Choose Location","Pune","Biwewadi", "Kondhwa","Pimpri-chinchwad","Hadpsar","Katraj"};
		JComboBox comboBox = new JComboBox(optionsToChoose);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setBounds(557, 157, 240, 34);
		contentPane.add(comboBox);
		
		Label label = new Label("Vaccine");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(376, 232, 77, 22);
		contentPane.add(label);
		
		String[] optionsToChoose1 = {"Choose Place","Covishield","Covaxin", "Sputnik V"};
		JComboBox comboBox_1 = new JComboBox(optionsToChoose1);
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox_1.setBounds(557, 232, 240, 30);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(376, 317, 62, 22);
		contentPane.add(lblNewLabel_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setToolTipText("Choose date");
		dateChooser.setBounds(557, 309, 240, 30);
		contentPane.add(dateChooser);
		JButton btnNewButton = new JButton("CONTINUE");
		btnNewButton.setBackground(new Color(0, 153, 153));
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
	      String place = (String) comboBox.getItemAt(comboBox.getSelectedIndex());
	      String vaccine = (String) comboBox_1.getItemAt(comboBox.getSelectedIndex());
	      //java.util.Date date=new java.util.Date();
	      //date = (java.util.Date)dateChooser.getDate();
	      java.util.Date date = dateChooser.getDate();
	      
	      
	      
	     
           
            String name = textField.getText();
            String aadhar =  textField_1.getText();
          
            Register r = new Register();
			JavaMySQLConnection jv  = new JavaMySQLConnection();
			boolean result=jv.getData(place,vaccine,date);
			//boolean result1 = jv.getDatape(r.name,r.gender,r.yearofbirth,r.number,place,vaccine,date);
			if(result)
			{
				//JOptionPane.showMessageDialog(null, "Data inserted successfully ....");
				JOptionPane.showMessageDialog(null, "Vaccinated Successfully !");
				certificate_ui c = new certificate_ui();
				c.name1.setText(name);
				c.aadhar_no.setText(aadhar);
				c.placev.setText(place);
				
				
				c.show();
				dispose();
				
			
				
			
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Can not insert the data..");
			}
			
	      
				
			}
		});
		btnNewButton.setBounds(414, 412, 352, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblChooseThePlace = new JLabel("                       Must choose the vaccination location and relevant information");
		lblChooseThePlace.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblChooseThePlace.setBounds(46, 34, 708, 37);
		contentPane.add(lblChooseThePlace);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\Desktop\\place.jpg"));
		lblNewLabel_2.setBounds(58, 149, 222, 293);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(46, 118, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(46, 82, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(46, 45, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField.setVisible(false);
		textField_1.setVisible(false);
		textField_2.setVisible(false);
		
		
		
	}
}
