package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="sort", urlPatterns="/sortservlet" )
public class LottoSortServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();

		Integer[] zahlen = (Integer[]) session.getAttribute("lottozahlen");
		Arrays.sort(zahlen);
		out.println("<table border='1'>");
		for (int i = 0; i < zahlen.length; i++) {
			out.println("<tr><td>"+ (i+1) +"</td> <td>"+zahlen[i]+"</td></tr>");
		}
		
		out.println("</table>");
	
	}

}
