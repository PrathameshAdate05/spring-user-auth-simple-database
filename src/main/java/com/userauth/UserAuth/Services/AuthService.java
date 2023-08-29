package com.userauth.UserAuth.Services;

import com.userauth.UserAuth.Dao.UserDao;
import com.userauth.UserAuth.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService implements AuthServiceInter{

    @Autowired
    UserDao userDao;

    @Override
    public boolean signup(User user) {

        List<User> temp = userDao.findAll();

        for (User tempUser : temp){
            if (user.getEmail().equals(tempUser.getEmail()))
                return false;
        }

        userDao.save(user);
        return true;
    }

    @Override
    public boolean login(User user) {
        List<User> temp = userDao.findAll();

        for (User tempUser : temp){
            if (user.getEmail().equals(tempUser.getEmail()) && user.getPassword().equals(tempUser.getPassword()))
                return true;
        }

        return false;
    }
}
