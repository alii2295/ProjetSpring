package com.ali.demo.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ali.demo.services.Userservice;
import com.ali.demo.model.User;



@RestController
@RequestMapping("/user")
public class usercontroler {
    @Autowired
    private Userservice us;
    @PostMapping("/ajouter")
    public User create_user(@RequestBody User u)
    {
        return us.create_user(u);
    }
    @GetMapping("/{username}")
    public User get_user(@PathVariable String username)
    {
        return us.find_user(username);
    }
    @DeleteMapping("/{username}")
    public void delete_user(@PathVariable String username)
    {
         us.delete_user(username);

    }





}
