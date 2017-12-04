
import java.sql.Connection;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

import jdbcconnection.Databaseconnection;
import java.sql.Connection;
import java.sql.Connection;/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String Firstname= request.getParameter("aname");
		String password=request.getParameter("adpass");
		String fstname,passw;
		PrintWriter pw= new PrintWriter(System.out);
		Databaseconnection db=new Databaseconnection();
		db.getconnect();
		Connection connection=null;
		try{
		java.sql.PreparedStatement psmt=connection.prepareStatement("select* from details(?,?,?,?,?,?,?,?)");
		psmt.execute();
		ResultSet rs;
		rs=psmt.executeQuery();
		while(rs.next())
		{
			pw.write((rs.getString(1)));
		
		}
		
		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		
}

}
