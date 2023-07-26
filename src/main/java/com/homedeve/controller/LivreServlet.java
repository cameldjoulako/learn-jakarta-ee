package com.homedeve.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/livre")
public class LivreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        
        String numeroSession =  session.getId();
        
        
        String identifiantLivre = request.getParameter("id");
        
        session.setAttribute("identifiantLivre", identifiantLivre);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCtml>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AboutServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Merci d'avoir choisi le livre "+identifiantLivre+ "</h2> <br />");
            out.println("<h5>Votre numéro de session est: "+numeroSession+ "</h5> <br />");
            out.print("<a href=\"payer-livre.html\">Clicker ici pour payer</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
