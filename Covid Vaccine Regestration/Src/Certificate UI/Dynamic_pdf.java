
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itextpdf.text.pdf.PdfWriter;

public class Dynamic_pdf {

	
	Dynamic_pdf(String s){
		
		String s1;
		
		try {
		    String file_name="E:\\Projects\\generatePDF\\b.pdf";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(file_name));
            document.open();
            
           
            
            document.add(Image.getInstance("E:\\Projects\\generatePDF\\Capture.JPG"));
            
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            
            Paragraph para = new Paragraph(" ");
            document.add(para);
            
            
            DBConnection conn = new DBConnection();
            Connection connection = conn.getConnection();
            PreparedStatement ps = null;
            ResultSet rs=null;
            Register r = new Register();
            //String s = r.textField.getText();
            
            ps=connection.prepareStatement("Select name,number from registermem where number = ?");
	        
            ps.setString(1,s);
			rs = ps.executeQuery();
            
           // String query="Select name,number from registermem where number = ?";
          
            
           // ps=connection.prepareStatement(query);
            //rs=ps.executeQuery();
            
            while(rs.next()) {
            	Paragraph para1 = new Paragraph("                            Beneficary name: "+rs.getString("name"));
            	
            //	+ " " +rs.getString("vaccine")+ " " +rs.getString("date")+ " " );
            	document.add(para1);
            
            	document.add(new Paragraph(" "));
 	            document.add(new Paragraph(" "));
            	/*Paragraph para2 = new Paragraph("                             IDProof : "+rs.getString("Idproof"));
            	document.add(para2);
            	document.add(new Paragraph(" "));
 	            document.add(new Paragraph(" "));*/
 	            
             	Paragraph para3 = new Paragraph("                             IDProof Number: "+rs.getString("Number"));
            	document.add(para3);
            	
            	document.add(new Paragraph(" "));
            	
            }
            
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            
            document.add(Image.getInstance("E:\\Projects\\generatePDF\\Capture1.JPG"));
            
            
            document.close();
            System.out.println("finished");
            
            
	}
	   catch(Exception e) {
       	System.out.println(e);
       }
       
	

}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		
	}

}
