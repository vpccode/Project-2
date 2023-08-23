package com.shoptask2.o.shoptask2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoptask2.o.shoptask2.model.Product;




public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
