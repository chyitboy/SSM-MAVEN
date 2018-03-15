package com.ssm.service;

import java.util.List;

import com.ssm.model.UserInfo;


public interface IUserService {

	public UserInfo getUserById(int userId);

	public void insertUser(UserInfo user);

	public void addUser(UserInfo user);

	public List<UserInfo> getAllUser();
}
