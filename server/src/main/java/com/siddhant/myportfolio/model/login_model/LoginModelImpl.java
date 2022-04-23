package com.siddhant.myportfolio.model.login_model;

import com.siddhant.myportfolio.data.AuthenticationRequest;
import com.siddhant.myportfolio.data.AuthenticationResponse;
import com.siddhant.myportfolio.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginModelImpl implements LoginModel {

  private final AuthenticationManager authenticationManager;
  private final UserDetailsService userDetailsService;
  private final JwtUtil jwtUtil;

  public LoginModelImpl(
      final AuthenticationManager authenticationManager,
      @Qualifier("myUserDetailsService") final UserDetailsService userDetailsService,
      final JwtUtil jwtUtil) {
    this.authenticationManager = authenticationManager;
    this.userDetailsService = userDetailsService;
    this.jwtUtil = jwtUtil;
  }

  @Override
  public ResponseEntity<?> createAuthenticationToken(final AuthenticationRequest request)
      throws Exception {
    try {
      authenticationManager.authenticate(
          new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
    } catch (final BadCredentialsException e) {
      throw new Exception("Incorrect username or password", e);
    }
    final String jwt =
        jwtUtil.generateToken(userDetailsService.loadUserByUsername(request.getUsername()));
    return ResponseEntity.ok(AuthenticationResponse.builder().jwt(jwt).build());
  }
}
