package org.datafetch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID =1L;
	
	public Login()
	{
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UsersDAO da=new UsersDAOImpl();
		String email= request.getParameter("email");
		String pwrd= request.getParameter("pass");
		String submitType=request.getParameter("submit");
		Users u= new Users();
		u=da.getUsers(email, pwrd);
		if(submitType.equals("Login") && u!=null && u.getEmail()!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("email", email);
			request.setAttribute("message", u.getEmail());
			request.getRequestDispatcher("welcome.jsp").forward(request,response);
		}
		else if(submitType.equals("Register"))
		{
			u=new Users();
			u.setName(request.getParameter("name"));
			u.setUsername(request.getParameter("uname"));
			u.setEmail(email);
			u.setPhone(request.getParameter("phone"));
			u.setPassword(pwrd);
			da.insertUsers(u);
			request.setAttribute("smessage", "Registration Successful,Please Login to continue");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("message", "Data Not Found, Please Register Yourself");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	

}
