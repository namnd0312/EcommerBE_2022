package com.ndnam.ecommerBE.repository;

import com.ndnam.ecommerBE.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {



    @Modifying
    @Query(value = "insert into testdb.public.product (name, price) values (:#{#product.name}, :#{#product.price})", nativeQuery = true)
    void saveProduct(@Param("product") Product product);
}
