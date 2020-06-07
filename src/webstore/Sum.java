package webstore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Sum {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
	
	static final String USER = "root";
	static final String PASS = "18102000";
	static Connection conn = null;
	static java.sql.Statement stmt = null;
	public static void Connection() {//outputs information from a table "sum" that records the total amount of the selected product
		try{

		Class.forName("com.mysql.cj.jdbc.Driver");


		
		conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql = "select * from firstdb.sum";
			ResultSet rs = stmt.executeQuery(sql);
			
			
			while(rs.next ()){

				int id = rs.getInt("sum(price)");
				
			


				System.out.println(id);
				
				}
				rs.close();
				}catch(SQLException se){

				se.printStackTrace();
				}catch(Exception e){

				e.printStackTrace();
				}finally{

				try{
				if(stmt!=null)
				conn.close();
				}catch(SQLException se){
				}
				try{
				if(conn!=null)
				conn.close();
				}catch(SQLException se){
				se.printStackTrace();
				}
		
		}}}
		

