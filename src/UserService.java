package com.aakash.service;

import java.util.List;

import com.aakash.beans.UserBean;
import com.aakash.beans.TrainException;

public interface UserService {

	public UserBean getUserByEmailId(String userEmailId) throws TrainException;

	public List<UserBean> getAllUsers() throws TrainException;

	public String updateUser(UserBean customer);

	public String deleteUser(UserBean customer);

	public String registerUser(UserBean customer);
	
	public UserBean loginUser(String username, String password) throws TrainException;

}
