package org.datafetch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/feedbackservlet")
public class feedbackservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp, String Statement) throws ServletException, IOException
	{
	

	Connection conn=null;
	String url,user=null,pass=null;
	url="jdbc:mysql://localhost:3306/feedback";
	user="root";
	pass="root";
	
	try {
		
	resp.setContentType("text/html");
		 String name=req.getParameter("name");
	      String email=req.getParameter("email");
	      String message=req.getParameter("message");
	      String subject=req.getParameter("subject");
		
		Class.forName("com.mysql.jdbc.Driver");
		
	
		conn=DriverManager.getConnection(url, user, pass);
		System.out.println("connected");
	
	    PreparedStatement st=conn.prepareStatement("insert into feedback values(?,?,?,?)");
		st.setString(1,name);
		st.setString(2,email);
		st.setString(3,subject);
		st.setString(4,message);
		st.executeUpdate();
		PrintWriter out=resp.getWriter();
		out.println("hihii");
	} 
	catch (Exception e)
	{
	
		e.printStackTrace(); 
	}

       
   

	

     
	}

}
