package com.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.Session;
import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class login
 */
@WebServlet("/Login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email1 = req.getParameter("username");
		String pass1 = req.getParameter("password");
		HttpSession session = req.getSession();
		RequestDispatcher dispatcher = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?useSSL=false", "root", "Ra123@123@123@");
			PreparedStatement pS = con.prepareStatement("select * from users where email1 = ? and pass1 = ?");
			pS.setString(1, email1);
			pS.setString(2, pass1);
			
			ResultSet rs = pS.executeQuery();
			if (rs.next()) {
				session.setAttribute("name", rs.getString("name1"));
				dispatcher = req.getRequestDispatcher("index.jsp");
			}else {
				req.setAttribute("status", "failed");
				dispatcher = req.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(req, resp);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
