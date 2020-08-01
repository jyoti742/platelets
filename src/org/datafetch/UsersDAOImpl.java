package org.datafetch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsersDAOImpl implements UsersDAO {
	
	static Connection con;
	static PreparedStatement ps;

	@Override
	public int insertUsers(Users user) {
		int status=0;
		
		try
		{
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into users values(?,?,?,?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPhone());
			ps.setString(5, user.getPassword());
			status=ps.executeUpdate();
			con.close();			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Users getUsers(String email, String password) {
		Users us=new Users();
		try
		{
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("select * from users where email=? and pass=?");
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				us.setEmail(rs.getString(3));
				us.setPassword(rs.getString(5));
			}
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return us;
	}

}
