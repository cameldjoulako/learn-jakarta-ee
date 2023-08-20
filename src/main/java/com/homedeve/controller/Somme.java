package com.homedeve.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Camel
 */
@WebServlet(name = "Somme", urlPatterns = {"/somme"})
public class Somme extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        int somme = 0;
        String n1 = request.getParameter("n1");        
        String n2 = request.getParameter("n2");    
        
        try {
            
            somme  = Integer.parseInt(n1) + Integer.parseInt(n2);
            
            String format = request.getParameter("format");
            request.setAttribute("somme", somme);
            
            if(format != null && format.equals("pdf")) {
                RequestDispatcher dispacher = request.getRequestDispatcher("/pdf");
                dispacher.forward(request, response);
            } else {}
        
            out.println("<!DOCtml>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Somme de deux nombres</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Somme des deux nombres: "+somme + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        } catch (NumberFormatException nfe) {
            //RequestDispatcher dispacher = request.getRequestDispatcher("/unexpected-error.html");
            RequestDispatcher dispacher = request.getRequestDispatcher("/unexpected-error");
            dispacher.forward(request, response);
        }
       
    }

    

}
