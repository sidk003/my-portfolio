package com.siddhant.myportfolio.model.login_model;

import com.siddhant.myportfolio.data.User;
import com.siddhant.myportfolio.repository.UserRepository;
import com.siddhant.myportfolio.util.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.siddhant.myportfolio.util.Status.*;
import static java.util.Objects.nonNull;

@Slf4j
@Service
public class LoginModelImpl implements LoginModel {

  private final UserRepository userRepository;

  public LoginModelImpl(final UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Status registerUser(final User user) {
    if (nonNull(userRepository.findByUsername(user.getUsername()))) {
      log.info("User: {} Already exists!", user.getUsername());
      return USER__ALREADY_EXISTS;
    } else {
      try {
        userRepository.save(user);
      } catch (final Exception e) {
        log.error("Couldn't save entry to db", e);
        return FAILURE;
      }
      log.info("User: {} Successfully Registered", user.getUsername());
      return SUCCESS;
    }
  }
}
