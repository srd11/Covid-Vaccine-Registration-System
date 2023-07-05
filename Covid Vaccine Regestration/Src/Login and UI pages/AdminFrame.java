import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

public class AdminFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
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
	public AdminFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField("Enter Id Here");
		textField.setToolTipText("Enter Id Here");
		textField.setBounds(70, 163, 322, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField("********");
		passwordField.setToolTipText("Enter Password");
		passwordField.setBounds(70, 245, 322, 44);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(0, 153, 153));
		btnNewButton.setForeground(Color.white);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String password = passwordField.getText();
				JavaMySQLConnection jv  = new JavaMySQLConnection();
				boolean result=jv.validateData(name,password);
				if(result)
				{
					JOptionPane.showMessageDialog(null, "Login Sucessfully ....");
					place p = new place();
					p.show();
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect id or password....");
				}
			}
		});
		btnNewButton.setBounds(132, 343, 208, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome To Login !");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel_2.setBounds(363, 11, 405, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\krushna madrewar\\Desktop\\admin.JPG"));
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\\\Users\\\\krushna madrewar\\\\Desktop\\\\admin.JPG").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(518, 107, 345, 315);
		contentPane.add(lblNewLabel);
	}
}
