package com.dk.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dk.jwt.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
