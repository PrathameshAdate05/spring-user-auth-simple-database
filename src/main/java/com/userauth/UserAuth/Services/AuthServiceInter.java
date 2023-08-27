package com.userauth.UserAuth.Services;

import com.userauth.UserAuth.Entities.User;

public interface AuthServiceInter {

    public boolean signup(User user);

    public boolean login(User user);
}
