package jdbcconnection;

import java.sql.Connection;

public class Insertion {
	
	Connection connection=null;

	public  void insert(String Firstname, String lastname, String gender, String email, String password, String location, String Number, int amount, String currency){
		
		/*
		try
		{
		
			connection =new Databaseconnection().getconnect();
			java.sql.PreparedStatement psmt=connection.prepareStatement("CREATE TABLE ? (id int(10),Name_of_Item varchar(30),Description varchar(30),Price int(20))");
			psmt.executeUpdate();
			psmt.setString(1, Firstname);
		
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	*/
			try
				{
			
					connection=new Databaseconnection().getconnect();
					java.sql.PreparedStatement psmt=connection.prepareStatement("Insert into details values(?,?,?,?,?,?,?,?,?);");
					 psmt.setString(1,Firstname);
					   psmt.setString(2,lastname);
					   psmt.setString(3, gender);
					   psmt.setString(4, email);
					   psmt.setString(5, password);
					   psmt.setString(6, location);
					   psmt.setString(7, Number);
					   psmt.setInt(8, amount);
					   psmt.setString(9, currency);
					   psmt.executeUpdate();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				
	}
	}

