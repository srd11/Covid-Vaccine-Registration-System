
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.border.EmptyBorder;

public class Admin2 extends JFrame implements ActionListener {

	private JPanel contentPane;

		JTable jt1;
		JButton b1,b2,b3;
		JPanel p1,p2;	
		JLabel l1,l2;
		JScrollPane jsp;
		ImageIcon im1;
		public Admin2()
		{
				setVisible(true);
				setSize(1000,730);
				//setBounds(100, 100, 900, 551);
				setLayout(null);

				im1=new ImageIcon("C:\\Users\\krushna madrewar\\eclipse-workspace1\\Vaccine\\src\\imgandpdf\\inf.png");
				l1=new JLabel(im1);
				p1=new JPanel();
				p1.setLayout(null);
				p1.setBackground(Color.white);
				b1=new JButton("Registered People");
				b2=new JButton("Vaccinated People");
				b3=new JButton("Requested People");
				p1.setBounds(0,0,300,800);

				b1.setBounds(50,50,200,50);
				b2.setBounds(50,150,200,50);
				b3.setBounds(50,250,200,50);
				l1.setBounds(5,330,300,279);
				p1.add(b1);p1.add(b2);p1.add(b3);p1.add(l1);

				p2=new JPanel();
				p2.setLayout(null);
				p2.setBounds(300,0,1000,800);
				p2.setBackground(Color.gray);
				add(p1);add(p2);
				
				jt1 = new JTable();
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
				jt1.setBounds(350,100,500,600);
				add(jt1);
				
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String s=ae.getActionCommand();
			if(s.equals("Registered People"))
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
					DefaultTableModel tb= (DefaultTableModel) jt1.getModel();
					tb.addRow(tbData);	
				}	
				
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
		}
		
		public static void main(String[] args) 
		{
			 Admin2 ip=new Admin2();	
		}
	}