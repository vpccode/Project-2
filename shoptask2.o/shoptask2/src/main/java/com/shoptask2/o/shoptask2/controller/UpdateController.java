package com.shoptask2.o.shoptask2.controller;




// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import com.shoptask2.o.shoptask2.controller.dto.ShopDto;
import com.shoptask2.o.shoptask2.model.Shopmodel;
import com.shoptask2.o.shoptask2.services.CreatService;

@Controller("/")
public class UpdateController {

    
    CreatService cs;

    public UpdateController(@Autowired(required=true) CreatService cs )
    {
        this.cs = cs;
     }

     @PutMapping( "/updateuser" )
    public Shopmodel update(ShopDto shopdto,Model model )
    {
        System.out.println("************************* ma  aayyaban ++++++++++");
        Shopmodel shopmodel= cs.findById( 702 );
        shopmodel.setUsername( shopdto.getUsername() );
        shopmodel.setEmail( shopdto.getEmail() );
        shopmodel.setPassword( shopdto.getPassword() );
        System.out.println("hello i am in update controller");
        // cs.save( shopmodel );

        // List<Shopmodel>user=cs.all();
        
        // int lastIndex = user.size() - 1;
        // Shopmodel lastuser = user.get(lastIndex);

        // model.addAttribute("myreg", lastuser);
        return cs.save(shopmodel);
    }
  
    
}
