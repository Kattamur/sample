package jdbcconnection;
import java.sql.Connection;
import java.sql.DriverManager;

public class Databaseconnection {

	public Connection getconnect()
		{
		java.sql.Connection connection=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pocketmoney","root","root");
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return connection;
			
		}
		
	}


