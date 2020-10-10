package com.jullia.hibernatedemorelations.oneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    @Autowired
    CartDao cartDao;

    public List<Cart> getCartList(){

        return cartDao.findCartList();
    }

    public Cart addCartDummyInfo(){
         Cart cart = new Cart();
         cart.setNume("cosul 1");

         Item item1 = new Item();
         item1.setName("telefon");

         Item item2 = new Item();
         item2.setName("televizor");

         List<Item> items = new ArrayList<>();
         items.add(item1); items.add(item2);

         cart.setItem(items);

         cartDao.save(cart);
         return cart;
    }
}
