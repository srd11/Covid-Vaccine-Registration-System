import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OTPVerification extends JFrame {

	private JPanel contentPane;
	public static JLabel phoneno_lb;
	JTextField tx2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OTPVerification frame = new OTPVerification();
					frame.setVisible(true);
					Login l = new Login();
					
					
					/*	String s=l.tx.getText();
						try {
							phoneno_lb.setText(s);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					*/
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OTPVerification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,900,551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OTP Verification");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
		lblNewLabel.setBounds(485, 84, 297, 29);
		contentPane.add(lblNewLabel);
		
		Login l1 =new Login();
		String s=l1.tx.getText();
		JLabel phoneno_lb = new JLabel("An OTP has been sent to registered mobile number");
		phoneno_lb.setForeground(new Color(128, 128, 128));
		phoneno_lb.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		phoneno_lb.setBounds(433, 149, 296, 36);
		contentPane.add(phoneno_lb);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(66, 71, 283, 374);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(27, 53, 227, 273);
		panel.add(lblNewLabel_1);
		//lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\\\Users\\\\krushna madrewar\\\\eclipse-workspace1\\\\Vaccine\\\\src\\\\imgandpdf\\\\login1.JPG").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\login1.JPG").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
		
		tx2 = new JTextField();
	    tx2.setBounds(433, 182, 296, 36);
		contentPane.add(tx2);
		tx2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("              There Might be some delay in receiving");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(419, 239, 332, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("                     the OTP due to heavy traffic");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBackground(new Color(128, 128, 128));
		lblNewLabel_3.setBounds(419, 266, 312, 29);
		contentPane.add(lblNewLabel_3);
		
		JTextArea tx_timer = new JTextArea();
		tx_timer.setBackground(new Color(255, 255, 255));
		tx_timer.setBounds(433, 24, 61, 20);
		contentPane.add(tx_timer);
		
		JButton b2 = new JButton("Verify And Continue ..");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*	String OtpC=tx2.getText();
				if(OtpC.equals(l1.otpmsg)){
					AddMember a = new AddMember();
					a.show();
					dispose();
				}
				 else {
					 String st = "Enter Valid OTP or Timeout";
					 JOptionPane.showMessageDialog(null, st);
				 }*/
				
				
				AddMember a = new AddMember();
				a.show();
				dispose();
			}
		});
		b2.setForeground(Color.white);
		b2.setBackground(new Color(0, 153, 153));
		b2.setBounds(433, 335, 296, 29);
		contentPane.add(b2);
	}
}
