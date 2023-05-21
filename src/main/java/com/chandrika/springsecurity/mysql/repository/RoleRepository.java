package com.chandrika.springsecurity.mysql.repository;

import com.chandrika.springsecurity.mysql.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
