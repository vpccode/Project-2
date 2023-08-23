package com.shoptask2.o.shoptask2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// import org.springframework.data.repository.CrudRepository;

import com.shoptask2.o.shoptask2.model.Shopmodel;

public interface ShopRepo extends JpaRepository<Shopmodel, Integer> {
    
}
