package com.ndnam.ecommerBE.service.impl;

import com.ndnam.ecommerBE.model.Role;
import com.ndnam.ecommerBE.repository.RoleRepository;
import com.ndnam.ecommerBE.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public void flush() {
        roleRepository.flush();
    }
}
