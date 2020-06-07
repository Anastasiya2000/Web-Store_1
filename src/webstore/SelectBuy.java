package webstore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectBuy {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
	
	static final String USER = "root";
	static final String PASS = "18102000";
	static Connection conn = null;
	static java.sql.Statement stmt = null;
	public static void Connection(int num) {//writes the numbers of the selected products to the table "buy"
		try{

		Class.forName("com.mysql.cj.jdbc.Driver");


		
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO firstdb.buy(id) " + 
					 "VALUES ("+num+")"); 

		
	
		
		conn.close();
		}catch (Exception e) { 
			 System.err.println("Got an exception! "); 
			 System.err.println(e.getMessage()); 
			 } 
		
		}
		
		}
			
