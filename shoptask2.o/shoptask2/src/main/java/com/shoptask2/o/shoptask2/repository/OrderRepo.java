package com.shoptask2.o.shoptask2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoptask2.o.shoptask2.model.Ordermodel;



public interface OrderRepo extends JpaRepository<Ordermodel,Integer> {
    
}
