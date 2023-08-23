package com.shoptask2.o.shoptask2.controller;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;

import com.shoptask2.o.shoptask2.model.AddressModel;

import com.shoptask2.o.shoptask2.repository.AddressRepo;
import com.shoptask2.o.shoptask2.services.AddressService;

@Controller
public class AddressController {

    @Autowired
    AddressService ad;

    @Autowired
    AddressRepo ap;



    @PostMapping("/address")
    public String addAddress(AddressModel a,Model model)
    {
        ad.save(a);
        // List<AddressModel>adress=ap.findAll();
        
        // int lastIndex = adress.size() - 1;
        // Address lastuser = adress.get(lastIndex);
        // for(AddressModel l:adress)
        // {
        //     System.out.println("*********************hi im in adress******************************"+l);
        // }


        
        return "ordertracking";

    }

    

    
}
