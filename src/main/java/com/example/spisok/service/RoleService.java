package com.example.spisok.service;

import com.example.spisok.entity.Role;
import com.example.spisok.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getRoleByName(String name) {
        return this.roleRepository.findFirstByRole(name);
    }
}
