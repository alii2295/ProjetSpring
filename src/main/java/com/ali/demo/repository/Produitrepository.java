package com.ali.demo.repository;

import com.ali.demo.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface Produitrepository extends JpaRepository<Produit,Long> {

}

