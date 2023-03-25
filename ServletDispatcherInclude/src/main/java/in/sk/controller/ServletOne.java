package in.sk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.println("<h1>Welcome to Servlet 1 of Servlet Dispatcher...</h1>");
		
		RequestDispatcher reqDis=request.getRequestDispatcher("/ServletTwo");
		reqDis.include(request, response);
		System.out.println("Dispatch is success");
		out.println("<h1>Servlet 1 responded again</h1>"); 
		out.close(); 
	}

}
