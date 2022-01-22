package com.siddhant.myportfolio.controller.login_controller;

import com.siddhant.myportfolio.util.Status;
import com.siddhant.myportfolio.data.User;

public interface LoginController {
    Status registerUser(User user);

    Status loginUser(User user);

    Status logUserOut( User user);
}
