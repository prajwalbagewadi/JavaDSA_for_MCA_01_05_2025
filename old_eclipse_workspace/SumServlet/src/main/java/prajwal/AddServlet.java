package prajwal;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init() throws ServletException{}
	protected void doGet(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException,IOException{ 
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		PrintWriter out=res.getWriter();
		out.println("Sum by Servlet="+(n1+n2));
	}
}
