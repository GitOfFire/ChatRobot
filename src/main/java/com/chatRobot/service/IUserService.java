package com.chatRobot.service;

import com.chatRobot.model.User;


public interface IUserService {

    public User selectUser(long userId);

    public void deleteUser(long userId);

    public void addUser(User user);

}