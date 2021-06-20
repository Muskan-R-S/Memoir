package com.memoir.memoir.repositories;

import domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUserName(String userName);

}
