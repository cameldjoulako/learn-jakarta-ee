package com.homedeve.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camel
 */
@WebServlet(name = "TestThreadSafeServlet", urlPatterns = {"/testThread"})
public class TestThreadSafeServlet extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();

        String montant = request.getParameter("montant");
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestThreadSafeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        out.println("<!DOCtml>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Thread Safe</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Vous avez retiré : "+ "<b>" + montant  +"</b>"+ " FCFA</h1>");
            out.println("</body>");
            out.println("</html>");
       
    }
}
