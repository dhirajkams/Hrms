package hrms.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDAO {
	
	public Connection getConnection() throws Exception{
		
		Connection con=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","root");
			System.out.println("TEST 6 CHANGES FROM DHIRAJ");
			}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}

}
