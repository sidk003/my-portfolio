package com.siddhant.myportfolio.model.login_model;

import com.siddhant.myportfolio.repository.UserRepository;
import com.siddhant.myportfolio.util.Status;
import com.siddhant.myportfolio.data.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import static com.siddhant.myportfolio.util.Status.*;
import static java.util.Objects.nonNull;

@Slf4j
@Service
public class LoginModelImpl implements LoginModel {

    private final UserRepository userRepository;

    public LoginModelImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Status registerUser(User user) {
        if (nonNull(userRepository.findByUsername(user.getUsername()))){
            log.info("User: {} Already exists!", user.getUsername());
            return USER_ALREADY_EXISTS;
        }
        else {
            try {
                userRepository.save(user);
            } catch (final Exception e){
                log.error("Couldn't save entry to db", e);
                return FAILURE;
            }
            log.info("User: {} Successfully Registered", user.getUsername());
            return SUCCESS;
        }
    }

    @Override
    public Status loginUser(User user) {
        try {
            final User existingUser = userRepository.findByUsername(user.getUsername());
            if (nonNull(existingUser)
                    && existingUser.getUsername().equals(user.getUsername())
                    && existingUser.getPassword().equals(user.getPassword())
                    && !existingUser.isLoggedIn()){
                user.setLoggedIn(true);
                user.setId(existingUser.getId());
                userRepository.save(user);
                log.info("User: {} Successfully Logged in", user.getUsername());
                return SUCCESS;
            }
        }
        catch (final Exception e){
            log.error("Couldn't save entry to db", e);
            return FAILURE;
        }
        log.info("Invalid username password");
        return FAILURE;
    }

    @Override
    public Status logUserOut(User user) {
        try {
            final User existingUser = userRepository.findByUsername(user.getUsername());
            if (nonNull(existingUser)
                    && existingUser.getUsername().equals(user.getUsername())
                    && existingUser.getPassword().equals(user.getPassword())
                    && existingUser.isLoggedIn()){
                user.setLoggedIn(false);
                user.setId(existingUser.getId());
                userRepository.save(user);
                log.info("User: {} Successfully Logged out", user.getUsername());
                return SUCCESS;
            }
        }
        catch (final Exception e){
            log.error("Couldn't save entry to db", e);
            return FAILURE;
        }
        return FAILURE;
    }
}
