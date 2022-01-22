package com.siddhant.myportfolio.repository;

import com.siddhant.myportfolio.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepo extends MongoRepository<User, String> {}
