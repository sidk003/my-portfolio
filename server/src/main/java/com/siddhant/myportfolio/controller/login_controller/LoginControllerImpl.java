package com.siddhant.myportfolio.controller.login_controller;

import com.siddhant.myportfolio.model.login_model.LoginModel;
import com.siddhant.myportfolio.util.Status;
import com.siddhant.myportfolio.data.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.siddhant.myportfolio.constants.ControllerConstants.*;

@AllArgsConstructor
@RestController
@RequestMapping(USER)
public class LoginControllerImpl implements LoginController{

    private final LoginModel model;

    @Override
    @PostMapping(USER_REGISTRATION)
    public Status registerUser(@Valid @RequestBody User newUser) {
        return model.registerUser(newUser);
    }

    @Override
    @PostMapping(USER_LOGIN)
    public Status loginUser(@Valid @RequestBody User user) {
        return model.loginUser(user);
    }

    @Override
    @PostMapping(USER_LOGOUT)
    public Status logUserOut(User user) {
        return model.logUserOut(user);
    }
}
