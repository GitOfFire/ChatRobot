package com.chatRobot.dao;

import com.chatRobot.model.User;

public interface IUserDao {

    User selectUser(long id);

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User user);
}