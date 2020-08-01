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

/**
 * Servlet implementation class feed
 */
@WebServlet("/feed")
public class feed extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public feed() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn=null;
		String url,user=null,pass=null;
		url="jdbc:mysql://localhost:3306/hospital";
		user="root";
		pass="root";
		
		try {
			
		response.setContentType("text/html");
			 String name=request.getParameter("name");
		      String email=request.getParameter("email");
		      String message=request.getParameter("message");
		      String subject=request.getParameter("subject");
			
			Class.forName("com.mysql.jdbc.Driver");
			
		
			conn=DriverManager.getConnection(url, user, pass);
			System.out.println("connected");
		
		    PreparedStatement st=conn.prepareStatement("insert into feedback values(?,?,?,?)");
			st.setString(1,name);
			st.setString(2,email);
			st.setString(3,subject);
			st.setString(4,message);
			st.executeUpdate();
			PrintWriter out=response.getWriter();
			out.println("<h1>hihii</h1>");
		} 
		catch (Exception e)
		{
		
			e.printStackTrace(); 
		}

	       
	   
	}

}
