import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	private JPanel contentPane;
    JTextField tx;
	String otpmsg;
	public String number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\login1.JPG"));
		lblNewLabel.setBounds(97, 81, 283, 327);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Register or Sign In for Vaccination");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(449, 120, 370, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("An OTP will be sent to your mobile number for verification");
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(449, 194, 370, 17);
		contentPane.add(lblNewLabel_2);
		
		tx = new JTextField();
		tx.setColumns(10);
		tx.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke)
			{
				String phno=tx.getText();
				int length=phno.length();
				char c=ke.getKeyChar();

				if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
				{
					if(length<10)
					{
						tx.setEditable(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter valid 10 digit number");
					}
				}
			}
		});
		tx.setToolTipText("Enter Mobile Number");
		tx.setBounds(449, 222, 370, 38);
		contentPane.add(tx);
			
		
		JButton btnNewButton = new JButton("GET OTP");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				place p =new place();
				Register r = new Register();
				r.phoneno1=tx.getText();
				//p.textField.setText(tx.getText());
				OTP otp = new OTP();
				SendOTP s= new SendOTP();
				//String apiKey="huc5jqxntR8L9PHlF4zsmKEY7DpfCrbB3SMWTgVZy2GaINJkiv0Qse2putdJ1XzNiEnSh3IcomkqFCRv";
				String apiKey="cli2Pj9eFwaoyCQHJ74WZdsqkEf5SV0MgmOLhBIp3N8RtDuGvrVGwJ9jDBmskEyPY7SM3iTlC6qefgQt" ;
				String otpmessage=otp.generateOTP(6);
			      otpmsg=otpmessage;	
				
				 number=tx.getText();
				
				if(number==null) {
					String st = "Enter mobile number";
					JOptionPane.showMessageDialog(null, st);
				}
				else {
					
					s.sendOTP("Hey this message is send by Shruti.Your OTP is"+otpmessage,number,apiKey);

					OTPVerification v = new OTPVerification();
					v.tx2.setText(otpmsg);
					v.show();
					dispose();
					
				}
			
				
		   //String s=tx.getText();
		    //((JLabel) v.phoneno_lb).setText(s);
			
			
			
			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(0, 153, 153));
		btnNewButton.setBounds(449, 294, 370, 38);
		contentPane.add(btnNewButton);
	}
}
