package com.siddhant.myportfolio.model.login_model;

import com.siddhant.myportfolio.data.User;
import com.siddhant.myportfolio.util.Status;

public interface LoginModel {
  Status registerUser(User user);
}
