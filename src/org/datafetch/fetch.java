package org.datafetch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fetch")
public class fetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn=null;
		String url,user=null,pass=null;
		url="jdbc:mysql://localhost:3306/hospital";
		user="root";
		pass="root";
		
		
		try {
			response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connected");
		
			conn=DriverManager.getConnection(url, user, pass);
		
			PreparedStatement st=conn.prepareStatement("select * from hospitallist");
			ResultSet rs=st.executeQuery();
			PrintWriter out=response.getWriter();
			out.println("<html class=main><head><link href=CSS/fetch.css rel=stylesheet type=text/css></head><body><h2>HOSPITAL LIST</h2><table class=tablecontent><thead><tr><th>S.NO.</th><th>NAME</th><th>ADDRESS</th><th>CONTACT NUMBER</th><th>PIN CODE</th></tr></thead>");
			while(rs.next()) 
			{
				out.println("<tbody><tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr></tbody>");
			}
			out.println("</table></body></html>");
		} 
		catch (Exception e)
		{
		
			e.printStackTrace(); 
		}
	
	 
	}

}
