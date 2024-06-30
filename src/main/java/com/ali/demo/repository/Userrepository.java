package com.ali.demo.repository;

import com.ali.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,String> {

}
