 package com.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegistrationServlet
 */

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String name1 = req.getParameter("name");
		String email1 = req.getParameter("email");
		String pass1 = req.getParameter("pass");
		String re_pass1 = req.getParameter("re_pass");
		String contact1 = req.getParameter("contact");
		
		
//		System.out.println("name: " + name1);
//		System.out.println("email: " + email1);
//		System.out.println("password: " + pass1);
//		System.out.println("repeated password: " + re_pass1);
//		System.out.println("contact: " + contact1);

		
		RequestDispatcher dispatcher = null;
		
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?useSSL=false", "root", "Ra123@123@123@");
			PreparedStatement pS = con.prepareStatement("insert into users(name1, email1, pass1, re_pass1, contact1) values(?,?,?,?,?)");
			
			pS.setString(1, name1);
			pS.setString(2, email1);
			pS.setString(3,pass1);
			pS.setString(4,re_pass1);
			pS.setString(5,contact1);
			
			
			
			
			int rowCount = pS.executeUpdate();
			dispatcher = req.getRequestDispatcher("registration.jsp");
			
			if (rowCount > 0) {
				req.setAttribute("status", "success");
			}
			else {
				req.setAttribute("status", "failled");
			}
			dispatcher.forward(req, resp);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("Exception: " + e.getMessage());

			e.printStackTrace();
		}  
		finally 
		{
            // Close the connection in the finally block to ensure it's always closed, even if an exception occurs.
            	try 
            	{
            		if (con != null) 
            		{
            			con.close();
            		}
            	} 
            		catch (SQLException e) 
            		{
            			e.printStackTrace();
            		}
        }
		
		
		
	}

}
