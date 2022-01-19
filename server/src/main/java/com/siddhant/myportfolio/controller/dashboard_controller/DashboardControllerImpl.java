package com.siddhant.myportfolio.controller.dashboard_controller;

import com.siddhant.myportfolio.model.dashboard_model.DashboardModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.siddhant.myportfolio.constants.ControllerConstants.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(DASHBOARD)
public class DashboardControllerImpl implements DashboardController {

    private DashboardModel model;

    @Override
    @GetMapping(DASHBOARD_GET_USER)
    public String getUserDetails() {
        return model.getUserDetails();
    }
}
