package com.siddhant.myportfolio.model.login_model;

import com.siddhant.myportfolio.util.Status;
import com.siddhant.myportfolio.data.User;

public interface LoginModel {
    Status registerUser(User user);

    Status loginUser(User user);

    Status logUserOut(User user);
}
