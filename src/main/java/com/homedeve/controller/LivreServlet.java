package com.homedeve.controller;

import com.homedeve.dto.Personne;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/livre")
public class LivreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Personne camel = new Personne("Camel", "Leonce");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCtml>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AboutServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bienvenue "+camel.getFullName()+ " to "+ request.getContextPath() + " et Merci à toi</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
