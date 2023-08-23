package com.shoptask2.o.shoptask2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoptask2.o.shoptask2.model.Product;
// import com.shoptask2.o.shoptask2.model.Shopmodel;
import com.shoptask2.o.shoptask2.repository.ProductRepo;

@Service
public class ProductService {

    private ProductRepo Pr;

    public ProductService(@Autowired ProductRepo pr) {
        this.Pr = pr;
    }

    public Product productSave(Product p)
    {
        return Pr.save(p);

    }

    public List<Product> all()
    {
        List<Product> result = new ArrayList<>();
        Pr.findAll().forEach( result::add );
        return result;
    }
    
    


    
}
