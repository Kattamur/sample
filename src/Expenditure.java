

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbcconnection.Expenditures;

/**
 * Servlet implementation class Expenditure
 */
@WebServlet("/Expenditure")
public class Expenditure extends HttpServlet {
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
		doGet(request, response);
		String item=request.getParameter("item");
		String desc=request.getParameter("descr");
		String Amounts=request.getParameter("amnt");
		int amount=Integer.parseInt(Amounts);
		
		new Expenditures().expenditure(item,desc,amount);
		response.setContentType("text/html");
		response.sendRedirect("Expenditures1.html");
	}

}
