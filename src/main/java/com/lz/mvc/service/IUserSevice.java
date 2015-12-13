package com.lz.mvc.service;


import java.util.List;

import com.lz.mvc.pojo.User;

public interface IUserSevice {

	public User getUserNameById(int id);
	
	public List<User> getUsers();
}
