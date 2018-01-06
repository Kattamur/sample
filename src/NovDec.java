

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

import com.mysql.jdbc.ResultSetMetaData;

/**
 * Servlet implementation class Gettingdetails
 */
@WebServlet("/NovDev")
public class NovDec extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pocketmoney","root","root");
			java.sql.PreparedStatement psmt=con.prepareStatement("select * from expenditures;");
			out.print("<table width=50% border=1>");
			out.println("Expenditures ");
			ResultSet rs=psmt.executeQuery();
			ResultSetMetaData rsd=(ResultSetMetaData) rs.getMetaData();
			int total=rsd.getColumnCount();
			out.print("<tr>");
			for(int i=1;i<=total;i++)
			{
				out.print("<th>"+rsd.getColumnName(i)+"</th>");
			}
			out.print("</tr>");
			while(rs.next())
			{
			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4));
			}
			out.print("</table>");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
	}

}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
