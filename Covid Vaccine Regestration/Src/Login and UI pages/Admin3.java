import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Admin3 extends JFrame {

	private JPanel contentPane;
	private JTable jt1;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTable table;
	private JScrollPane scrollPane;
	DefaultTableModel tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin3 frame = new Admin3();
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
	public Admin3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
			     Class.forName("com.mysql.jdbc.Driver");	
				 //JOptionPane.showMessageDialog(null,"Driver registered");

				Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3307/vaccine1","root","root");
				//JOptionPane.showInputDialog(this,"Connection created");
				
				
				
				PreparedStatement ps1=co.prepareStatement("select * from registermem");
				ResultSet rs=ps1.executeQuery();
				int i=0;
				while(rs.next())
				{
						
					String name = rs.getString("Name");
					String gender= rs.getString("gender");
					String YearOfBirth = rs.getString("YearOfBirth");
					String number = rs.getString("number");
					
					
					String tbData[]= {name,gender,YearOfBirth,number};
				    tb= (DefaultTableModel) jt1.getModel();
					tb.addRow(tbData);	
				}	
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
			
		});
		btnNewButton.setBounds(10, 71, 301, 23);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 56, 414, 329);
		contentPane.add(scrollPane);
		
		jt1 = new JTable();
		scrollPane.setViewportView(jt1);
		jt1.setColumnSelectionAllowed(true);
		jt1.setCellSelectionEnabled(true);
		jt1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"name", "gender", "YearOfBirth", "number"
			}
		));
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = jt1.getSelectedRow();
			}
		});
		btnNewButton_1.setBounds(10, 161, 301, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 246, 301, 23);
		contentPane.add(btnNewButton_2);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"gender", "Name", "New column"
			}
		));
		table.setBounds(235, 454, -190, -143);
		contentPane.add(table);
	}

}
