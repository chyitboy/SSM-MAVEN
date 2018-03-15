package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.model.*;


@Service("userService")  
public class UserServiceImpl implements IUserService {

	@Autowired   
    private UserMapper userDao;
	public UserInfo getUserById(int userId) {  
		
       return userDao.queryByPrimaryKey(userId);   
    }   
     
    public void insertUser(UserInfo user) {   
        userDao.insertUser(user);   
    }   
     
    public void addUser(UserInfo user) {   
        userDao.insertUser(user);   
    }   
     
    @Override   
    public List<UserInfo> getAllUser() {   
        return userDao.getAllUser();   
    }   

}
