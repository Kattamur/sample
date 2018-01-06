

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminValidations
 */
@WebServlet("/AdminValidations")
public class AdminValidations extends HttpServlet {
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
		response.setContentType("text/html");
		String Firstname= request.getParameter("aname");
		String password=request.getParameter("adpass");
		String dbname=null;
		String dbpassw=null;
		PrintWriter out=response.getWriter();
	
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pocketmoney","root","root");
			java.sql.PreparedStatement psmt=conn.prepareStatement("select  * from details where firstname=? and password=?");
			psmt.setString(1,Firstname );
			psmt.setString(2, password);
			ResultSet rs=psmt.executeQuery();
			
			while(rs.next())
			{
			dbname=rs.getString(1);
			dbpassw=rs.getString(5);
			}
			if(Firstname.equals(dbname) && password.equals(dbpassw))
			{
				out.println("<script type=\"text/javascript\">");
				out.println("alert('welcome Saiteja');");
				out.println("location='sucessfull.html';");
				out.println("</script>");
			}
			else
			{
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Name or Password is  incorrect');");
				out.println("location='adminlogin.html';");
				//response.sendRedirect("adminlogin.html");
				out.println("</script>");
			}
			
		}
	catch(Exception ex)
		{
		System.out.println(ex);
		}
	
	}
	}


