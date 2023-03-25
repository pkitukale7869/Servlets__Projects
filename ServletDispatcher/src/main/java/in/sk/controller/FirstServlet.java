package in.sk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In First Servlet");
		//PrintWriter out =response.getWriter();
		//out.println("<h1>Welcome to Servlet 1 of Servelt Dispatcher...</h1>");
		 RequestDispatcher reqDis=request.getRequestDispatcher("/servlet2");
		 reqDis.forward(request, response);
		 
		//out.close();
	}

}
