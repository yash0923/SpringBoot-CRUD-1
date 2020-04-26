/**
 * 
 */
package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created in Eclipse IDE.
 * Project : spring-mvc-jdbc-master
 * User: yash
 * Date: 18/01/2020
 */
@Service
public class UserServiceImpl implements IUserService{

	private IUser userRepo;
	
	//Spring Setter Injection
	@Autowired
	public void setUserRepo(IUser userRepo) {
		this.userRepo = userRepo;
	}


	@Override
	public Iterable<User> listAllUsers() {
		return userRepo.findAll();
	}

	//"id" bilgisine göre bir kullanıcı getirir.
	@Override
	public User getUserById(long id) {
		return userRepo.findOne(id);
	}

	//Kullanıcı bilgisini kaydeder.
	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	//"id" bilgisine göre kullanıcıyı siler.
	@Override
	public void deleteUser(long id) {
		
		 userRepo.delete(id);
		
	}

	
}
