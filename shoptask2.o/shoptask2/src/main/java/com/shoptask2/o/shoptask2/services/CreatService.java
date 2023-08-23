
package com.shoptask2.o.shoptask2.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoptask2.o.shoptask2.model.Shopmodel;

import com.shoptask2.o.shoptask2.repository.ShopRepo;


@Service
public class CreatService implements MainService {

    private final ShopRepo shopRepo;

    public CreatService(@Autowired ShopRepo shopRepo )
    {
        this.shopRepo=shopRepo;
    }

    @Override
    public Shopmodel save(Shopmodel s_obj )
    {
        
        return shopRepo.save( s_obj );
    }

    @Override
    public void delete( int u_id )
    {
        shopRepo.deleteById( u_id );
    }

    @Override
    public List<Shopmodel> all()
    {
        List<Shopmodel> result = new ArrayList<>();
        shopRepo.findAll().forEach( result::add );
        return result;
    }

    @Override
    public Shopmodel findById( int u_id )
    {
        
        // Item eleItem=ItemRepository.findById(u_id);
        List<Shopmodel>myresult=all();
        for(Shopmodel i:myresult)
        {
            System.out.println("i="+i);
            if(i.getId()==u_id)
            {
                return i;
            }
            
        

        }
        return null;
        
    }





    
}
