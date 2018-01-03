package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Lotto;
@WebServlet(name="lotto", urlPatterns="/lottoservlet")
public class LottoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(true);// Session erzeugen
		
		int n = Integer.parseInt(req.getParameter("n"));
		int max = Integer.parseInt(req.getParameter("max"));
		
		Integer[] intarr = Lotto.createNumbers(n, max);
		session.setAttribute("lottozahlen", intarr);// Array in der Session speichern
		out.println("<table border='1'>");
		for (int i = 0; i < intarr.length; i++) {
			out.println("<tr><td>"+ (i+1) +"</td> <td>"+intarr[i]+"</td></tr>");
		}
		
		out.println("</table>");
		
		out.println("<a href ='/Lotto/sortservlet' >Sortieren</a>");
		
		
	}

}
