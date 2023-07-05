import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
public class firstpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstpage frame = new firstpage();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public firstpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		Border g1=BorderFactory.createLineBorder(Color.white,1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(1, 1, 900, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("ADMIN ");
		//btnNewButton_2.setBorder(g1);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(0, 139, 139));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminFrame a = new AdminFrame();
				a.show();
				dispose();
			}
		});
		btnNewButton_2.setBounds(701, 11, 123, 30);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("ABOUT US");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutus aa=new aboutus();
				aa.show();
				dispose();
			}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_1.setBackground(new Color(0, 139, 139));
		btnNewButton_2_1.setBounds(558, 11, 123, 30);
		panel.add(btnNewButton_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(83, 219, 187, 234);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(43, 0, 106, 111);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\\\Users\\\\krushna madrewar\\\\eclipse-workspace1\\\\Vaccine\\\\src\\\\imgandpdf\\\\inf.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
		
		JButton btnNewButton_1 = new JButton("Book an Apoointment");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setBounds(0, 108, 187, 94);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().open(new java.io.File("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\a.pdf"));
				}
				catch(Exception e2){
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(0, 139, 139));
		btnNewButton_1.setForeground(Color.BLACK);
		
		JLabel lblNewLabel_3 = new JLabel("How to book Appointment?");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_3.setBounds(24, 198, 153, 25);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(342, 219, 187, 234);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel();
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\Vaccine.jpg"));
		
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\\\Users\\\\krushna madrewar\\\\eclipse-workspace1\\\\Vaccine\\\\src\\\\imgandpdf\\\\Vaccine.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));lblNewLabel_1.setBounds(39, -13, 100, 111);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(601, 219, 187, 234);
		contentPane.add(panel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel();
		lblNewLabel_1_1.setIcon(new ImageIcon(new ImageIcon("C:\\\\Users\\\\krushna madrewar\\\\eclipse-workspace1\\\\Vaccine\\\\src\\\\imgandpdf\\\\covid2.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));lblNewLabel_1.setBounds(39, 0, 106, 111);
JButton btnNewButton_1_1 = new JButton("Get Your Vaccination Safely");
btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
btnNewButton_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try {
			Desktop.getDesktop().open(new java.io.File("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\Dos_and_Donts_for_Citizens.pdf"));
		}
		catch(Exception e2){
			e2.printStackTrace();
		}
	}
});
btnNewButton_1_1.setForeground(Color.BLACK);
btnNewButton_1_1.setBackground(new Color(0, 139, 139));
btnNewButton_1_1.setBounds(0, 109, 187, 94);
panel_1_1.add(btnNewButton_1_1);
JLabel lblNewLabel_3_1 = new JLabel("Do's and Dont's");
lblNewLabel_3_1.setVerticalAlignment(SwingConstants.BOTTOM);
lblNewLabel_3_1.setBounds(50, 198, 153, 25);
panel_1_1.add(lblNewLabel_3_1);
		//lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\covid2.JPG"));
		
		lblNewLabel_1_1.setBounds(47, 0, 106, 111);
		panel_1_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Register For Vaccination");
		lblNewLabel_3_2.setBounds(24, 198, 153, 25);
		panel_1_1_1.add(lblNewLabel_3_2);
		lblNewLabel_3_2.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(0, 109, 187, 92);
		panel_1_1_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.show();
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 139, 139));
		
		JLabel lblNewLabel_2 = new JLabel("Get Vaccinated Today !");
		lblNewLabel_2.setBackground(new Color(0, 128, 128));
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel_2.setBounds(284, 101, 386, 55);
		contentPane.add(lblNewLabel_2);
		//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\registration.png"));
	}
}
