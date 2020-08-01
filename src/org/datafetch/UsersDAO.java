package org.datafetch;

public interface UsersDAO {
	public int insertUsers(Users user);
	public Users getUsers(String email,String password);

}
