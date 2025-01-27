package com.xiangql.service;

import com.xiangql.beans.UserBean;
import java.util.List;

public interface UserService {
    void saveUser(UserBean user);

    void updateUser(UserBean user);

    void deleteUser(int id);

    UserBean getUserById(int id);

    List<UserBean> getAllUsers();
}