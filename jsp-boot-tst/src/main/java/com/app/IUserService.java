/**
 * 
 */
package com.app;


/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */
public interface IUserService {

	   public Iterable<User> listAllUsers();

	   public User getUserById(long id);

	   public User saveUser(User user);
	    
	   public void deleteUser(long id);
	
}
