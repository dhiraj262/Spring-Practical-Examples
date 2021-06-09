package com.dk.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dk.jwt.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, String>{

}
