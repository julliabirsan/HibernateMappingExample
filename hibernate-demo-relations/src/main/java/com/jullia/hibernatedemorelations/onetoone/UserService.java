package com.jullia.hibernatedemorelations.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getUserList(){
        return userDao.findAllUsers();
    }

    public User addDummyInfo(){
        User user = new User();
        user.setUsername("testUSername");

        Address address = new Address();
        address.setAddress("strada cu flori 5");

        user.setAddress(address);

        userDao.save(user);
        return user;
    }
}
