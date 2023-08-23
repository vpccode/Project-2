package com.shoptask2.o.shoptask2.services;


import org.springframework.beans.factory.annotation.Autowired;

import com.shoptask2.o.shoptask2.model.Shopmodel;
import com.shoptask2.o.shoptask2.repository.ShopRepo;

public abstract class Add implements MainService {

    private final ShopRepo shopRepo;

    public Add(@Autowired ShopRepo shopRepo )
    {
        this.shopRepo=shopRepo;
    }

    @Override
    public Shopmodel save(Shopmodel s_obj )
    {
        
        return shopRepo.save( s_obj );
    }
}





