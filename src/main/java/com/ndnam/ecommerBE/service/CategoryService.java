package com.ndnam.ecommerBE.service;

import com.ndnam.ecommerBE.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(Long id);

    void save (Category model);

    void remove(Long id);
}
