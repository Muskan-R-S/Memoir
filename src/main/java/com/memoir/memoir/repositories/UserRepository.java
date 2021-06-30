package com.memoir.memoir.repositories;

import com.memoir.memoir.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUserName(String userName);
    User findByEmail(String email);
    User findByuserName(String userName);
}
