

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbcconnection.Insertion;

/**
 * Servlet implementation class Registrationss
 */
@WebServlet("/Registrationss")
public class Registrationss extends HttpServlet {
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
		String Firstname=request.getParameter("fname");
		String Lastname=request.getParameter("lname");
		
		String Gender=request.getParameter("gender");
	
		
		
		String email=request.getParameter("email");
		String Password=request.getParameter("pass");
		String Location=request.getParameter("location");
		String Number=request.getParameter("mobile");
	
		String currency=request.getParameter("curr");
		String Amount=request.getParameter("amount");
		int amount=Integer.parseInt(Amount);
	
		
		
		
		
		new Insertion().insert(Firstname,Lastname,Gender,email,Password,Location,Number,amount,currency);
		response.setContentType("text/html");
		
	}

}
