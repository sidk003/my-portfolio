package com.siddhant.myportfolio.model.dashboard_model;

import com.siddhant.myportfolio.data.UserDetailResponseView;
import org.springframework.stereotype.Service;

@Service
public class DashboardModelImpl implements DashboardModel {
    @Override
    public UserDetailResponseView getUserDetails() {
        return UserDetailResponseView.builder().build();
    }
}
