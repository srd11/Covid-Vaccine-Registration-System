import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class aboutus extends JFrame {

		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						aboutus a1=new aboutus();
						a1.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public aboutus() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 900, 551);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.menu);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Concerning Ourselves");
			lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
			lblNewLabel.setBounds(366, 11, 214, 42);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\group.JPG"));
			lblNewLabel_1.setBounds(111, 168, 335, 333);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Group Members");
			lblNewLabel_2.setForeground(Color.RED);
			lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
			lblNewLabel_2.setBounds(475, 208, 208, 33);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("64      Prathamesh Shinde");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(503, 247, 350, 33);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_3_1 = new JLabel("66      Pratik Bhise");
			lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_3_1.setBounds(503, 281, 350, 33);
			contentPane.add(lblNewLabel_3_1);
			
			JLabel lblNewLabel_3_1_1 = new JLabel("67      Pratik Kadam");
			lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_3_1_1.setBounds(503, 317, 350, 33);
			contentPane.add(lblNewLabel_3_1_1);
			
			JLabel lblNewLabel_3_1_1_1 = new JLabel("73      Raj Singh");
			lblNewLabel_3_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_3_1_1_1.setBounds(503, 350, 350, 33);
			contentPane.add(lblNewLabel_3_1_1_1);
			
			JLabel lblNewLabel_3_1_1_1_1 = new JLabel("79     Shruti Devshatwar");
			lblNewLabel_3_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_3_1_1_1_1.setBounds(503, 382, 350, 33);
			contentPane.add(lblNewLabel_3_1_1_1_1);
			
			JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("87     Rutuja Jotrao");
			lblNewLabel_3_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_3_1_1_1_1_1.setBounds(503, 416, 350, 33);
			contentPane.add(lblNewLabel_3_1_1_1_1_1);
			
			JLabel lblNewLabel_2_1 = new JLabel("We make every effort to make it the best it can be. We created a desktop-based application that allows");
			lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_2_1.setBounds(159, 72, 637, 71);
			contentPane.add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("anyoneto register and receive immunisation information.");
			lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_2_1_1.setBounds(294, 112, 357, 71);
			contentPane.add(lblNewLabel_2_1_1);
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.setBackground(SystemColor.activeCaptionBorder);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					firstpage f =  new firstpage();
					f.show();
					dispose();
				}
			});
			btnNewButton.setBounds(29, 24, 89, 23);
			contentPane.add(btnNewButton);
		}
	}