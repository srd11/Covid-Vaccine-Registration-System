import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class certificate_ui extends JFrame {

	private JPanel contentPane;
	JLabel name1;
	JLabel aadhar_no;
	JLabel placev;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					certificate_ui frame = new certificate_ui();
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
	public certificate_ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\icon.jpeg"));
		lblNewLabel.setBounds(0, 0, 269, 137);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\heading.jpeg"));
		lblNewLabel_1.setBounds(269, 0, 439, 137);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 137, 708, 201);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Beneficiery Name :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(120, 32, 118, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Aaadhar Id : ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(120, 79, 119, 24);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Vaccinated At : ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(120, 127, 118, 24);
		panel.add(lblNewLabel_4);
		
		Register r =  new Register();
		name1 = new JLabel(r.nm);
		name1.setBounds(271, 35, 143, 19);
		name1.setText(r.name);
		panel.add(name1);
		
		aadhar_no = new JLabel("New label");
		aadhar_no.setBounds(271, 82, 143, 19);
		panel.add(aadhar_no);
		
	    placev = new JLabel("New label");
		placev.setBounds(271, 132, 143, 19);
		panel.add(placev);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(0, 330, 671, 239);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\modi.jpeg"));
		
		JButton btnNewButton = new JButton("Download");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = aadhar_no.getText();
				Dynamic_pdf d = new Dynamic_pdf(s);
				JOptionPane.showMessageDialog(null, "Pdf downloaded at position E:\\\\Projects\\\\generatePDF\\\\b.pdf!");
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(0, 153,153));
		btnNewButton.setBounds(510, 580, 151, 25);
		contentPane.add(btnNewButton);
	}
}
