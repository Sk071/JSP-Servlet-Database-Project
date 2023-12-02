package com.submitservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubmitServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		Connection con;
		int result = 0;
		PrintWriter out = res.getWriter();
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		int age = Integer.parseInt(req.getParameter("age"));
		String city = req.getParameter("city");
		
		
		System.out.println("fname: "+fname);
		System.out.println("lname: "+lname);
		System.out.println("age: "+age);
		System.out.println("city: "+city);
		
		try {
		
		con = ConnectionProvider.getDBcon();
		String insertSQL = "INSERT INTO user (fname, lname, age, city) VALUES (?, ?, ?, ?)";
		PreparedStatement preparedStatement = con.prepareStatement(insertSQL);
		preparedStatement.setString(1, req.getParameter("fname"));
	    preparedStatement.setString(2, req.getParameter("lname"));
	    preparedStatement.setInt(3, Integer.parseInt(req.getParameter("age")));
		preparedStatement.setString(4, req.getParameter("city"));
		
		result = preparedStatement.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		out.println("Records updated into database");
		
		res.setContentType("text/html");
		out.println("</br>");
		out.println("</br>");
		
		res.setContentType("text/html");
		out.println("<a href=\"UserData\">Click to see database entries</a>");

		
		
	}

}
