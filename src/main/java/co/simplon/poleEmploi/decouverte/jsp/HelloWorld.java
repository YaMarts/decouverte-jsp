package co.simplon.poleEmploi.decouverte.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	private String messageGet;
	private String messagePut;

	public void init() throws ServletException {
		messageGet = "Hello ";
		messagePut = "Bonjour ";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = messageGet;
		String parametre = request.getParameter("nom");
		if (parametre != null) {
			message += parametre;
		} else {
			message += "World";
		}

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//////		String message = messagePut;
//////		String parametre = request.getParameter("nom");
//////		if (parametre != null) {
//////			message += parametre;
//////		} else {
//////			message += "World";
//////		}
//////
//////		response.setContentType("text/html");
////
////		PrintWriter out = response.getWriter();
////		out.println("<h1>" + message + "</h1>");
		
		public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			
			Personne personne = new Personne();
			Personne personne1 = new Personne();
			personne.setNom(request.getParameter("nom"));
			personne.setPrenom(request.getParameter("prenom"));
			personne1.setNom(request.getParameter("nom1"));
			personne1.setPrenom(request.getParameter("prenom1"));
						
//		request.setAttribute("P1", personne);
//		request.setAttribute("P2", personne);
			
			ArrayList<Personne> liste = new ArrayList<Personne>(); 
			
			liste.add(personne);
			liste.add(personne1);
			request.setAttribute("personnes", liste);
			
		request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
	}

	public void destroy() {

	}
}
