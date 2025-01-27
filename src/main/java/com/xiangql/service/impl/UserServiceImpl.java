package com.xiangql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiangql.beans.UserBean;
import com.xiangql.dao.UserDao;
import com.xiangql.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(UserBean user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(UserBean user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public UserBean getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<UserBean> getAllUsers() {
        return userDao.getAllUsers();
    }
}
