/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.first;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author cordadev
 */
@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {

  

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out = response.getWriter(); 
      
       String name = request.getParameter("name"); // get values from parameters 
       if(name == null || name.trim().isEmpty())
       {
           name = "Guest";
       }
       out.println("Hello " + name);
       
       out.println("<html>");
       out.println("<head>");
       out.println("</head>");
       out.println("<body>");
       out.println("<h3> Here is heading from println </h4>");
       out.println("</body> </html>");
       
       out.println("<form action='HelloServlet' method='get'>");
out.println("Enter your name: ");
out.println("<input type='text' name='name'>");
out.println("<input type='submit' value='Submit'>");
out.println("</form>");
       
    String message = "message from servlet";
    
    request.setAttribute("msg", message);

    RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
    rd.forward(request, response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
                
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    @Override
public void init() throws ServletException {
    System.out.println("Servlet initialized!");
}
    
}
