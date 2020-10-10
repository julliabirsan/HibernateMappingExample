package com.jullia.hibernatedemorelations.onetoone;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Component
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAllUsers(){
        Query query = entityManager.createNativeQuery("select * from user;", User.class);
        return query.getResultList();
    }

    @Transactional
    public User save(User user){
        entityManager.persist(user);
        return user;
    }
}
