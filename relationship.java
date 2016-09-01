import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addServlet() {
		super();
	}

	
		protected void doGet(HttpServletRequest request,
				HttpServletResponse response) throws ServletException,
				IOException {
			response.setContentType("text/html");
			String name1 = request.getParameter("name1");
			String name2 = request.getParameter("name2");
			String result1[] = { "Affectionate", "lovable", "tragedy-person",
					"angry-guy", "comedian", "easily apadtable",
					"straight-forwarded", "innocent", "childish",
					"very clever", "passionate" };
			String result2[] = { "Affectionate", "lovable", "tragedy-person",
					"angry-guy", "comedian", "easily apadtable",
					"straight-forwarded", "innocent", "childish",
					"very clever", "passionate" };
			String relation[] = { "love", "Marriage", "friends", "bestiee",
					"enemy", " fake relation ",
					"realtion seems like mother and daughter",
					"seems friends but internally lovers",
					"act like friend but hating each other",
					"brthers and sisters" };
			String random1 = (result1[new Random().nextInt(result1.length)]);
			String random2 = (result2[new Random().nextInt(result2.length)]);
			String random3 = (relation[new Random().nextInt(relation.length)]);
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>");
			out.println("relatinship website");
			out.println("</title>");
			out.println("</head>");
			out.println("<body bgcolor=\"#6699ff\">");
			out.println("<h2 style=\"color:#000000\"> see your character and relationship </h2>");
			out.println("CHARACTERS:");
			out.println("<br>");
			out.println(name1 + "-->" + random1);
			out.println("<br>");
			out.println(name2 + "-->" + random2);
			out.println("<br>");
			out.println("RELATIONSHIP:");
			out.println("<br>");
			out.println("relationship--->" + random3);
			out.println("</body");
			out.println("</html>");
				}
}
