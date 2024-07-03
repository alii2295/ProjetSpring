package com.ali.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name ;
    private double price;
    @ManyToOne
    @JoinColumn(name="id_cat",nullable = false)
    private Categorie categorie;
    @OneToMany(mappedBy="p")
    private List<Commande> commandes;

}


