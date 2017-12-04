package jdbcconnection;
import java.sql.Connection;
import java.sql.ResultSet;
public class Comparing {
					
		Connection connection=null;
		
	public void compare(){
	
		try
	
			{
			
			connection=new Databaseconnection().getconnect();
			java.sql.PreparedStatement psmt=connection.prepareStatement("select * from details;");
			
			
			
			

			}
		catch(Exception ex)
	
		{
			
			System.out.println(ex);
		
		}

}
}