package com.imooc.miaosha.service;

import com.imooc.miaosha.dao.UserDao;
import com.imooc.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User getById(int id){
        return userDao.getById(id);
    }

    //@Transactional
    public boolean tx(){
        User user = new User();
        user.setId(2);
        user.setName("qqq");
        userDao.insert(user);

        User user2 = new User();
        user2.setId(2);
        user2.setName("qqq");
        userDao.insert(user2);

        return true;
    }


}
