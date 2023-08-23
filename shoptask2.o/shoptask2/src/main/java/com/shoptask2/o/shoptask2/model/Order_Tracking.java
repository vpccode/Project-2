package com.shoptask2.o.shoptask2.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_tracking")
public class Order_Tracking {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    

    private Integer tracking_id;
    
    private String status;
    private LocalDate update_date;

    public Order_Tracking() {
    }
    @ManyToOne
    private Ordermodel order_id;

    public Ordermodel getOrder_id() {
        return order_id;
    }
    public void setOrder_id(Ordermodel order_id) {
        this.order_id = order_id;
    }
    public int getTracking_id() {
        return tracking_id;
    }
    public void setTracking_id(int tracking_id) {
        this.tracking_id = tracking_id;
    }
   
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDate getUpdate_date() {
        return update_date;
    }
    public void setUpdate_date(LocalDate up_date) {
        this.update_date = up_date;
    }




    
}
