package com.chatRobot.dao;

import com.chatRobot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired(required = false)
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 2;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }

    @Test
    public void testAddUser() throws Exception {
        int id = 9;
        User user = new User();
        user.setId(id);
        user.setEmail("6448334@163.com");//邮箱设定有去重
        user.setUsername("陈小春");
        user.setRegIp("66678");
        user.setPassword("123456");
        user.setRegTime(new Date());
        user.setRole("演员");
        user.setStatus(6);

        dao.addUser(user);
        System.out.println("插入动作结束");
    }
    @Test
    public void testDeleteUser() throws Exception {
        int id = 1;
        dao.deleteUser(id);
    }
    @Test
    public void testUpdateUser() throws Exception {
        User user = new User();
        user.setId(2);
        user.setUsername("刘德华");
        user.setPassword("123456");
        user.setRegTime(new Date());

        dao.updateUser(user);
        System.out.println("修改完毕");
    }


}