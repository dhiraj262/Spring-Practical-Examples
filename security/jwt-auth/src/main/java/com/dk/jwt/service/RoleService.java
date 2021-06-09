package com.dk.jwt.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.jwt.entity.Role;
import com.dk.jwt.repository.RoleRepository;

@Service
@Transactional
public class RoleService {
	
	@Autowired
    private RoleRepository roleRepository;

    public Role createNewRole(Role role) {
        return roleRepository.save(role);
    }
}
