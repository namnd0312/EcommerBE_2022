package com.ndnam.ecommerBE.service;

import com.ndnam.ecommerBE.model.Role;

public interface RoleService {

    void save(Role role);

    Role findByName(String name);

    //Đẩy thay đổi vào DB để query lại
    void flush();
}
