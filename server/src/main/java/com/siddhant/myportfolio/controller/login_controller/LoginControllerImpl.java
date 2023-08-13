package com.siddhant.myportfolio.controller.login_controller;

import com.siddhant.myportfolio.data.User;
import com.siddhant.myportfolio.model.login_model.LoginModel;
import com.siddhant.myportfolio.util.Status;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.siddhant.myportfolio.constants.ControllerConstants.USER;
import static com.siddhant.myportfolio.constants.ControllerConstants.USER_REGISTRATION;

@AllArgsConstructor
@RestController
@RequestMapping(USER)
public class LoginControllerImpl {

  private final LoginModel model;

  @PostMapping(USER_REGISTRATION)
  public Status registerUser(@Valid @RequestBody final User newUser) {
    return model.registerUser(newUser);
  }
}
