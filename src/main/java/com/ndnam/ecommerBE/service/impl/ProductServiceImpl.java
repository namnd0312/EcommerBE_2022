package com.ndnam.ecommerBE.service.impl;

import com.ndnam.ecommerBE.model.Product;
import com.ndnam.ecommerBE.repository.ProductRepository;
import com.ndnam.ecommerBE.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveProduct(Product product) {
        productRepository.saveProduct(product);
    }
}
