/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TyHalvorsen
 */
public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        if (request.getParameter("username") != null && request.getParameter("password") != null) {
            session.invalidate();
            session = request.getSession();
        }
        
        ArrayList<Integer> numbers = (ArrayList<Integer>)session.getAttribute("numbers");
        
        if(numbers == null)
            numbers = new ArrayList<>();
        
        if (request.getParameter("number") != null) {
            int number = Integer.parseInt(request.getParameter("number"));
            numbers.add(number);
            
            session.setAttribute("numbers", numbers);
        }
        
        double average = 0.0;
        for(int number : numbers) {
            average += number;
        }
        
        if (numbers.size() > 0) {
            average /= numbers.size();
        }
        
        request.setAttribute("average", average);
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
        
    @Override
    protected void doPost(HttpServletRequest, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    
}
