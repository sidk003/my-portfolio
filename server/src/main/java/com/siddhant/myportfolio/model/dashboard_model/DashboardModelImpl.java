package com.siddhant.myportfolio.model.dashboard_model;

import org.springframework.stereotype.Service;

@Service
public class DashboardModelImpl implements DashboardModel {

    @Override
    public String getUserDetails() {
        return "Henlo";
    }
}
