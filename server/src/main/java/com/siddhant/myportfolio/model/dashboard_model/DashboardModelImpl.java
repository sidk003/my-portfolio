package com.siddhant.myportfolio.model.dashboard_model;

import com.siddhant.myportfolio.data.User;
import org.springframework.stereotype.Service;

@Service
public class DashboardModelImpl implements DashboardModel {
  @Override
  public User getUserDetails() {
    return User.builder().username("TEST").build();
  }
}
