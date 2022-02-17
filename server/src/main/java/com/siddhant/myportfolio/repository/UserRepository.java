package com.siddhant.myportfolio.repository;

import com.siddhant.myportfolio.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
