package com.shoptask2.o.shoptask2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoptask2.o.shoptask2.model.Product;
// import com.shoptask2.o.shoptask2.model.Shopmodel;
// import com.shoptask2.o.shoptask2.repository.ProductRepo;
import com.shoptask2.o.shoptask2.services.ProductService;

@Controller
public class ProductController {

    // @GetMapping("/add")
    // public String getProduct()
    // {
    //     return product;

    // }
//     @Autowired
//    private ProductRepo Pr;

   @Autowired
   private ProductService Ps;

   


    @PostMapping("/add_product")
    public String addProduct(Product p,Model model)
    {
        // System.out.println("i am in product   *********************"+p);
        Ps.productSave(p);

        

        
        List<Product>product=Ps.all();
        
        int lastIndex = product.size() - 1;
        Product lastpProduct = product.get(lastIndex);

       
        

        model.addAttribute("myreg", lastpProduct);
        //  for(Product p1:product)
        // {
        //     System.out.println("product is:"+p1);
        // }

        return "showproduct";



    }
     @GetMapping("/show_product")
    public String getProduct()
     {
         return "showproduct";

    }
   
    
    
}
