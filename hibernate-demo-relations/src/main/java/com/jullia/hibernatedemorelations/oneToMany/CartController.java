package com.jullia.hibernatedemorelations.oneToMany;

import com.jullia.hibernatedemorelations.onetoone.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping("/cart")
    @ResponseBody
    public List<Cart> getCart(){
        return cartService.getCartList();
    }

    @GetMapping("/cartDummyInfo")
    @ResponseBody
    public Cart addCartDummyInfo(){
        return cartService.addCartDummyInfo();
    }
}
