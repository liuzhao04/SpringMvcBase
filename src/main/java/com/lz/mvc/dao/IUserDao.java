package com.lz.mvc.dao;

import java.util.List;

import com.lz.mvc.pojo.User;

public interface IUserDao {
	public User getUser(int id);

	public List<User> getUsers();
}
