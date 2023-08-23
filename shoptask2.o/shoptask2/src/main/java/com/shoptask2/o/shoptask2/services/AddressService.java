package com.shoptask2.o.shoptask2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoptask2.o.shoptask2.model.AddressModel;
import com.shoptask2.o.shoptask2.repository.AddressRepo;

@Service
public class AddressService {

    private AddressRepo ap;

    public AddressService(@Autowired AddressRepo ap) {
        this.ap = ap;
    }

    public AddressModel save(AddressModel ad)
    {
        return ap.save(ad);

    }

    
    
}
