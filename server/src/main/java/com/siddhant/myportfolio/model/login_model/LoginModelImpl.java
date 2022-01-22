package com.siddhant.myportfolio.model.login_model;

import com.siddhant.myportfolio.service.UserService;
import com.siddhant.myportfolio.util.Status;
import com.siddhant.myportfolio.data.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginModelImpl implements LoginModel {

    private final UserService userService;

    public LoginModelImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Status registerUser(User user) {
        userService.addUser(user);
        log.info("User: {} Successfully Registered", user.toString());
        return Status.SUCCESS;
    }

    @Override
    public Status loginUser(User user) {
        user.setLoggedIn(true);
        log.info("User: {} Successfully Logged in", user.toString());
        return Status.SUCCESS;
    }

    @Override
    public Status logUserOut(User user) {
        user.setLoggedIn(false);
        log.info("User: {} Successfully Logged out", user.toString());
        return Status.SUCCESS;
    }
}
