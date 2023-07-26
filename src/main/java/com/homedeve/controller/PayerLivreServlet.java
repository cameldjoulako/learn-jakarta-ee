package com.homedeve.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/payerLivre")
public class PayerLivreServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String numeroCarte = request.getParameter("numeroCarte");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCtml>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Paiement éffectué</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Paiement effectué avec le numéro de carte: "+numeroCarte+ "</h2> <br />");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
