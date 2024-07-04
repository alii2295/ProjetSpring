package com.ali.demo.repository;
import com.ali.demo.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Commanderepository extends JpaRepository<Commande,Long> {
}
