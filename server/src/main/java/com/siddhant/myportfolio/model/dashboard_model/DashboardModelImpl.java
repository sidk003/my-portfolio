package com.siddhant.myportfolio.model.dashboard_model;

import com.siddhant.myportfolio.data.User;
import com.siddhant.myportfolio.service.user_detail_service.MyUserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class DashboardModelImpl implements DashboardModel {

  final MyUserDetailsService userDetailsService;

  public DashboardModelImpl(final MyUserDetailsService userDetailsService) {
    this.userDetailsService = userDetailsService;
  }

  @Override
  public User getUserDetails(final String userName) {
    return userDetailsService.getUserByUserName(userName);
  }
}
