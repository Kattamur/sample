package jdbcconnection;

import java.sql.Connection;

public class Expenditures {

	 
		Connection connection=null;
		public void expenditure(String item, String desc, int amount){
		try
		{
			connection=new Databaseconnection().getconnect();
			java.sql.PreparedStatement psmt=connection.prepareStatement("Insert into expenditures(Name_of_Item,Description,Amount) values(?,?,?) ;");
			
			psmt.setString(1,item );
			psmt.setString(2, desc);
			psmt.setInt(3, amount);
			psmt.executeUpdate();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	
		}
}
