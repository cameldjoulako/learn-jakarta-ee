package com.homedeve.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/payerLivre")
public class PayerLivreServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        
        String numeroSession =  session.getId();
        String numeroCarte = request.getParameter("numeroCarte");
        
        String identifiantLivre = (String) session.getAttribute("identifiantLivre");
        
        
        //méthode 1  de suppression de la ssession  
          session.setAttribute("identifiantLivre", null);
          
          //méthode2  de suppression de la ssession  
          session.removeAttribute("identifiantLivre");
          
          
          //méthode2  de suppression de la ssession:  cas des deconnexion pour retirer complement du serveur
          session.invalidate();
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCtml>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Paiement éffectué</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Paiement effectué avec le numéro de carte: "+numeroCarte+ "</h2> <br />");
            out.println("<h2>Le numéro du livre payé est : "+identifiantLivre+ "</h2> <br />");
            out.println("</body>");
            out.println("</html>");
            
          
            
        }
    }

}
