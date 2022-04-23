package com.siddhant.myportfolio.model.login_model;

import com.siddhant.myportfolio.data.AuthenticationRequest;
import org.springframework.http.ResponseEntity;

public interface LoginModel {
  ResponseEntity<?> createAuthenticationToken(AuthenticationRequest request) throws Exception;
}
