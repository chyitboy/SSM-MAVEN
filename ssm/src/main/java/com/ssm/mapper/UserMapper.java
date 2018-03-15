package com.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.ssm.model.UserInfo;

public interface UserMapper {

    public UserInfo queryByPrimaryKey(Integer id);    
    
   public List<UserInfo> queryUserByBatch(Map<String,Object> params);    
         
   public void insertUser(UserInfo user);    
         
    public void insertUserByBatch(List<UserInfo> list);    
         
    public void deleteByPrimaryKey(Integer id);    
         
    public void delteUserByBatch(Map<String,Object> params);    
         
    public void updateByPrimaryKey(Integer id); 
     
    public List<UserInfo> getAllUser();  
}
