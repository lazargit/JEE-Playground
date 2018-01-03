package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="session2",urlPatterns="/session2" )
public class Session2Servlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html><head></head><body>");
		
		String vorname = String.valueOf(session.getAttribute("vorname"));
		
		LocalDate date = (LocalDate) session.getAttribute("datum");
		
		out.println("<h2>"+vorname+"</h2>");
		out.println("<h2>"+date+"</h2>");
		
		
		out.print("</body></html>");
		out.close();
	}
	
	

}
