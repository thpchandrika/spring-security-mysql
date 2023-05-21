package com.chandrika.springsecurity.mysql.repository;

import com.chandrika.springsecurity.mysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
