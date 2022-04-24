package com.siddhant.myportfolio.service.user_detail_service;

import com.siddhant.myportfolio.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

  private final UserRepository userRepository;

  public MyUserDetailsService(final UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(final String userName) throws UsernameNotFoundException {
    final com.siddhant.myportfolio.data.User existingUser = userRepository.findByUsername(userName);
    return new User(existingUser.getUsername(), existingUser.getPassword(), List.of());
  }
}
