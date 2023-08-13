package com.siddhant.myportfolio.model.dashboard_model;

import com.siddhant.myportfolio.data.User;

public interface DashboardModel {
  User getUserDetails(String userName);
}
