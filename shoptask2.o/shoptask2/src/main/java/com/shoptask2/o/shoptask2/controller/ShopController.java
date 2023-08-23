package com.shoptask2.o.shoptask2.controller;


import java.util.List;

// import java.util.List;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;

import com.shoptask2.o.shoptask2.model.Shopmodel;
import com.shoptask2.o.shoptask2.repository.ShopRepo;



@Controller
public class ShopController {
      @Autowired
    private ShopRepo shopRepo;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/createuser")
    public String saveUser(Shopmodel usernew,Model model)
    {

        System.out.println("*********************");
        System.out.println("inside create");
        System.out.println("************************");
        
       
        shopRepo.save(usernew);

        List<Shopmodel>user=shopRepo.findAll();
        
        int lastIndex = user.size() - 1;
        Shopmodel lastuser = user.get(lastIndex);
       

        
        model.addAttribute("myreg", lastuser);
        return "product";
    }

    //  @PutMapping("/updateuser")
    // public String updateUser(Shopmodel usernew,Model model)
    // {

    //     System.out.println("*********************");
    //     System.out.println("inside update ");
    //     System.out.println("************************");
        
       
    //     shopRepo.save(usernew);

    //     Iterable<Shopmodel>user=shopRepo.findAll();
       



        
        
    //     model.addAttribute("myreg", user);
    //     return "welcome";
    // }





    
}

