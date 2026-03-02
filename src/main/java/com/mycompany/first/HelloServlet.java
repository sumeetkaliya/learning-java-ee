/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.first;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cordadev
 */
@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {

    @Resource(name = "jdbc/myfirstsql")
    private DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<String> users = new ArrayList<>();

        try (Connection con = dataSource.getConnection()) {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name FROM users");

            while (rs.next()) {
                users.add(rs.getString("name"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        request.setAttribute("userList", users);

        RequestDispatcher rd = request.getRequestDispatcher("users.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // code for jsp 
        String name = request.getParameter("username");

        String message = "Hello " + name + ", welcome to JSP & Servlet!";

        request.setAttribute("msg", message);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);

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
