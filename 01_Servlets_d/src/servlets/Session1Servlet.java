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
@WebServlet(name="session1",urlPatterns="/session1" )
public class Session1Servlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession(true);// Session erzeugen, wenn noch keine da ist
		
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html><head></head><body>");
		
		String vorname = req.getParameter("vorname");// <input name="vorname"
		
		out.println("<h2>"+vorname+"</h2>");
		
		out.println("<a href='/ServletTest/session2'>Weiter</a>");
		out.print("</body></html>");
		out.close();
		
		session.setAttribute("vorname", vorname);
		session.setAttribute("datum", LocalDate.now());
		
	}
	
	

}
