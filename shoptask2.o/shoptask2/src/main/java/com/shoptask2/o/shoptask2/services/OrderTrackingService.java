package com.shoptask2.o.shoptask2.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shoptask2.o.shoptask2.model.Order_Tracking;

import com.shoptask2.o.shoptask2.repository.Order_TrackingRepo;

@Service
public class OrderTrackingService {

    private Order_TrackingRepo op;

    public OrderTrackingService(@Autowired Order_TrackingRepo op) {
        this.op = op;
    }

    public Order_Tracking save(Order_Tracking ad)
    {
        return op.save(ad);

    }
    public void setOrderStatus(Order_Tracking ad)
    {
        ad.setStatus("yes");

        
    }

    public void setOrderDate(Order_Tracking ad)
    {
        LocalDate l=LocalDate.now();
        LocalDate newDate = l.plusDays(7);

        ad.setUpdate_date(newDate);
    }

    public List<Order_Tracking> all()
    {
        List<Order_Tracking> result = new ArrayList<>();
        op.findAll().forEach( result::add );
        return result;
    }
    
}
