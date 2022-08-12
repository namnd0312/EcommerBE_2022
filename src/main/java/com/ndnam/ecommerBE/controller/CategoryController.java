package com.ndnam.ecommerBE.controller;

import com.ndnam.ecommerBE.model.Category;
import com.ndnam.ecommerBE.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Category>> getAllCategory(){
        List<Category> categories = this.categoryService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Category> getAllCategory(@PathVariable Long id){
        Category category = this.categoryService.findById(id);

        if(category == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> removeCategoryById(@PathVariable Long id){
        Category category = this.categoryService.findById(id);
        if(category == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.categoryService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/createUpdate")
    public ResponseEntity<Void> createUpdate(@RequestBody Category category){
        this.categoryService.save(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
