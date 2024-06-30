package com.ali.demo.services;
import com.ali.demo.model.User;
import com.ali.demo.repository.Userrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    private Userrepository u;
    public User create_user(User us)
    {
        return u.save(us);
    }
    public void delete_user(String us_name)
    {
        u.deleteById(us_name);
    }
    public User find_user(String us_name)
    {
       return u.findById(us_name).orElse(null);
    }



}
