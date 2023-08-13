package com.siddhant.myportfolio.service.user_detail_service;

import com.siddhant.myportfolio.data.User;
import com.siddhant.myportfolio.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Slf4j
@Service
public class MyUserDetailsService {

  private final UserRepository userRepository;

  public MyUserDetailsService(final UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User getUserByUserName(final String userName) {
    final User user = userRepository.findByUsername(userName);
    if (isNull(user)) {
      log.warn("User not found: {}", userName);
      throw new IllegalArgumentException("User not found");
    }
    return user;
  }
}
