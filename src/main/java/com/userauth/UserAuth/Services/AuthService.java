package com.userauth.UserAuth.Services;

import com.userauth.UserAuth.Dao.UserDao;
import com.userauth.UserAuth.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements AuthServiceInter{

    @Autowired
    UserDao userDao;

    @Override
    public boolean signup(User user) {
        userDao.save(user);
        return true;
    }

    @Override
    public boolean login(User user) {
        return false;
    }
}
