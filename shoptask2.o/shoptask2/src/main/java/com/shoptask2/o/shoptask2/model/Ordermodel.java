package com.shoptask2.o.shoptask2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Shop_order")
public class Ordermodel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    
    private Integer order_id;
    private String order_date;
    private double total_price;
    @ManyToOne
    private Shopmodel id;

    public Shopmodel getId() {
        return id;
    }
    public void setId(Shopmodel id) {
        this.id = id;
    }

   
   
    
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public String getOrder_date() {
        return order_date;
    }
    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }
    public double getTotal_price() {
        return total_price;
    }
    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
  
    
}
