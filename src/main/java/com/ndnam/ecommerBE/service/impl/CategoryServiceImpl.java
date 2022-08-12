package com.ndnam.ecommerBE.service.impl;

import com.ndnam.ecommerBE.model.Category;
import com.ndnam.ecommerBE.repository.CategoryRepository;
import com.ndnam.ecommerBE.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void save(Category model) {
        categoryRepository.save(model);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.remove(id);
    }
}
