package javaConnetion;
import java.sql.*;
public class MysqlCOnnection {

	public static void main(String[] args) throws  Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn =   DriverManager.getConnection("jdbc:mysql://localhost/javadb","root","");
		
//		System.out.println("Connected Successfully." + conn);
//		
//		Statement st = conn.createStatement();
//		
//		st.executeUpdate("CREATE DATABASE kunjeshDb");
//		ResultSet rs = st.executeQuery("show databases");
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
	
	
//	String query = "create table patna(name varchar(30),age int , mail varchar(30))";
//	Statement st = conn.createStatement();
//	st.executeUpdate(query);
//	System.out.println("table created");
//	
//	
//	String query = "insert into patna values('Kunjesh babu',19,'imkunjesh@gmail.com')";
//	Statement st = conn.createStatement();
//	st.executeUpdate(query);
//	System.out.println("Data  Inserted");
//


//	String Query = "DELETE FROM patna WHERE name= 'Kunjesh babu' ";
//	Statement str = conn.createStatement();
//	str.executeUpdate(Query);
//	                        
	
	String Querys = "UPDATE patna SET name = 'Priya', age = 20, mail = 'impriya@gmail.com' WHERE name = 'Kunjesh babu' " ;                                                  
	  Statement stttt = conn.createStatement();
	  stttt.executeUpdate(Querys);
	  
	  
	String query1 = "select * from patna";
	Statement st1 = conn.createStatement();
	ResultSet ress = st1.executeQuery(query1);
//	ResultSet res = st1.executeUpdate(query1);
	while(ress.next()) {		
		System.out.println(ress.getString("Name") + "-" + ress.getString("age") + "-"+ ress.getString("mail"));		
	}
//	

	}
}





 
          