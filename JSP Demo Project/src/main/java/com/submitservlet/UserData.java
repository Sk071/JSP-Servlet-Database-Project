package com.submitservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class UserData extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		Connection con;
		res.setContentType("text/html");  
        out.println("<html><body>");  
        try 
        {  
        	con = ConnectionProvider.getDBcon();
             
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from user");  
            out.println("<table border=1 width=50% height=50%>");  
            out.println("<tr><th>First Name</th><th>Last Name</th><th>Age</th><th>City</th><tr>");  
            while (rs.next()) 
            {  
                String fname = rs.getString("fname");  
                String lname = rs.getString("lname");  
                int age = rs.getInt("age");  
                String city = rs.getString("city");   
                out.println("<tr><td>" + fname + "</td><td>" + lname + "</td><td>" + age + "</td><td>" + city + "</tr>");   
            }  
            out.println("</table>");  
            out.println("</html></body>");  
            con.close();  
           }  
            catch (Exception e) 
           {  
            out.println("error");  
        }  
	}
}


