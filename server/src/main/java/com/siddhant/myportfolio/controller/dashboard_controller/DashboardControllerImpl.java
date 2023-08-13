package com.siddhant.myportfolio.controller.dashboard_controller;

import com.siddhant.myportfolio.data.User;
import com.siddhant.myportfolio.model.dashboard_model.DashboardModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.siddhant.myportfolio.constants.ControllerConstants.DASHBOARD;
import static com.siddhant.myportfolio.constants.ControllerConstants.DASHBOARD_GET_USER;

@RestController
@RequestMapping(DASHBOARD)
public class DashboardControllerImpl {
  private final DashboardModel model;

  public DashboardControllerImpl(final DashboardModel model) {
    this.model = model;
  }

  @GetMapping(DASHBOARD_GET_USER)
  public User getUserDetails(final String userName) {
    return model.getUserDetails(userName);
  }
}
