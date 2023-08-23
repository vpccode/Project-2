package com.shoptask2.o.shoptask2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Address")
public class AddressModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Address_id;
    private String address;
    private String city;
    private String country;
    
    public AddressModel() {
    }

    @ManyToOne
    private Shopmodel id;
    
    public Integer getAddress_id() {
        return Address_id;
    }

    public void setAddress_id(Integer address_id) {
        Address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Shopmodel getId() {
        return id;
    }

    public void setId(Shopmodel id) {
        this.id = id;
    }

    



    

    
}
