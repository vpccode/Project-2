package com.shoptask2.o.shoptask2.services;

import java.util.List;

// import com.shoptask2.o.shoptask2.model.Product;
import com.shoptask2.o.shoptask2.model.Shopmodel;

public interface MainService {
    Shopmodel save( Shopmodel s_obj );

        void delete( int u_id );

         List<Shopmodel> all();

         Shopmodel findById( int u_id );

        
}
