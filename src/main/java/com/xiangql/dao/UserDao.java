package com.xiangql.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.xiangql.beans.UserBean;

@Mapper
public interface UserDao {
    void saveUser(UserBean user);
    void updateUser(UserBean user);
    void deleteUser(int id);
    UserBean getUserById(int id);
    List<UserBean> getAllUsers();
}