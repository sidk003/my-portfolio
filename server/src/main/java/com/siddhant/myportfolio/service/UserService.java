package com.siddhant.myportfolio.service;

import com.siddhant.myportfolio.data.User;
import com.siddhant.myportfolio.repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public void addUser(User user){
        try{
            userRepo.insert(user);
            log.info("User: username: {}, email:{} successfully added to DB", user.getUsername(), user.getEmail());
        }
        catch (final Exception e){
            log.error("Error inserting item to DB: {}", e.getMessage());
        }
    }
}
