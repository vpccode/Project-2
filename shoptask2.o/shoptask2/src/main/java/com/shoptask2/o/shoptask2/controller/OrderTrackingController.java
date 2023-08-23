package com.shoptask2.o.shoptask2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoptask2.o.shoptask2.model.Order_Tracking;
import com.shoptask2.o.shoptask2.services.OrderTrackingService;


@Controller
public class OrderTrackingController {

    @Autowired
    private OrderTrackingService Ots;

     @PostMapping("/ordertracking")
    public String saveUser(Order_Tracking ad,Model model)
    {

        System.out.println("*********************");
        System.out.println("order tracked ");
        System.out.println("************************");
        Ots.setOrderStatus( ad);
        Ots.setOrderDate(ad);


       
        Ots.save(ad);

        List<Order_Tracking>ordertrack=Ots.all();
        
        int lastIndex = ordertrack.size() - 1;
        Order_Tracking lasttrack = ordertrack.get(lastIndex);
       

        
        model.addAttribute("myreg", lasttrack);
        return "newwelcome";
    }



    


    


    
}
