import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMember extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMember frame = new AddMember();
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
	public AddMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("           Welcome Here !");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel.setBounds(509, 64, 243, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\Mem.JPG"));
		lblNewLabel_1.setBounds(178, 22, 243, 171);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("REGISTER MEMBER");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register r = new Register();
				r.show();
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(544, 126, 196, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\Desktop\\ia.JPG"));
		lblNewLabel_2.setBounds(27, 99, 1190, 533);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Instructions");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel_3.setBounds(48, 221, 177, 27);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setBackground(new Color(0,153,153));
		
		JLabel otpp = new JLabel("New label");
		otpp.setVisible(false);
		otpp.setBounds(48, 74, 46, 14);
		contentPane.add(otpp);
	}
}
