package webstore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BlackList {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
	
	static final String USER = "root";
	static final String PASS = "18102000";
	static Connection conn = null;
	static java.sql.Statement stmt = null;
	public static void Connection(String name, String lastname) {//records the data of people who did not pay for the product in the table "blacklist"
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");


			
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = (Statement) conn.createStatement();
			String query = "insert into firstdb.blacklist(name,lastname) values (?,?)";
					PreparedStatement preparedStmt = conn.prepareStatement(query);
					preparedStmt.setString (1, name);
					preparedStmt.setString (2, lastname);
				
				
			
					 int rows = preparedStmt.executeUpdate();

			
			conn.close();
			}catch (Exception e) { 
				 System.err.println("Got an exception! "); 
				 System.err.println(e.getMessage()); 
				 } 
	}
}
