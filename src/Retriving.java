
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Retriving {
	
	public static void main(String[] args) {
		
		try
		{
			ArrayList<String> al=new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
	Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pocketmoney","root","root");
		java.sql.PreparedStatement psmt=conn.prepareStatement("select  from details;");
		
		ResultSet rs=psmt.executeQuery();
				while(rs.next())
				{
					al.add(rs.getString(1));
					System.out.println(al);
				}
		
		}
		catch(Exception ex)
		
		{
			System.out.println(ex);
		}
		
		

	}

}