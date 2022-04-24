package com.siddhant.myportfolio.model.login_model;

import com.siddhant.myportfolio.data.AuthenticationRequest;
import com.siddhant.myportfolio.data.User;
import com.siddhant.myportfolio.util.Status;
import org.springframework.http.ResponseEntity;

public interface LoginModel {
  ResponseEntity<?> createAuthenticationToken(AuthenticationRequest request) throws Exception;

  Status registerUser(User user);
}
