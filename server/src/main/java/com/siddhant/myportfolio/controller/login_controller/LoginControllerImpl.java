package com.siddhant.myportfolio.controller.login_controller;

import com.siddhant.myportfolio.data.AuthenticationRequest;
import com.siddhant.myportfolio.model.login_model.LoginModel;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.siddhant.myportfolio.constants.ControllerConstants.AUTHENTICATE;
import static com.siddhant.myportfolio.constants.ControllerConstants.USER;

@AllArgsConstructor
@RestController
@RequestMapping(USER)
public class LoginControllerImpl {

  private final LoginModel model;

  @PostMapping(AUTHENTICATE)
  public ResponseEntity<?> authenticate(@Valid @RequestBody final AuthenticationRequest request)
      throws Exception {
    return model.createAuthenticationToken(request);
  }
}
