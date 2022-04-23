package com.siddhant.myportfolio.service.user_detail_service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
  @Override
  public UserDetails loadUserByUsername(final String userName) throws UsernameNotFoundException {
    //      TODO; fetch user from DB
    return new User("test", "test", List.of());
  }
}
