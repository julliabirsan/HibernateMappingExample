package com.jullia.hibernatedemorelations.oneToMany;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CartDao {

    @PersistenceContext
    EntityManager entityManager;

    public List<Cart> findCartList(){
        Query query = entityManager.createNativeQuery("select * from cart", Cart.class);
        return query.getResultList();
    }

    @Transactional
    public Cart save(Cart cart){
        entityManager.persist(cart);
        return cart;
    }
}
