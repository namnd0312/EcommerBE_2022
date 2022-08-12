package com.ndnam.ecommerBE.controller;

import com.ndnam.ecommerBE.model.Product;
import com.ndnam.ecommerBE.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/product/create")
    ResponseEntity<?> createProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
