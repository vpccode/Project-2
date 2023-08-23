package com.shoptask2.o.shoptask2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoptask2.o.shoptask2.model.AddressModel;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;



public interface AddressRepo extends JpaRepository<AddressModel, Integer> {
    
}

