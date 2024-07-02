package com.ali.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;}
    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategorie(Categorie categorie ) {
        this.categorie =categorie;

    }
}


