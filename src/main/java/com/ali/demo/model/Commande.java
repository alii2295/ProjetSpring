package com.ali.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Commande {
    @Id
    @GeneratedValue
    private long id_commande;
    private long totale;
    @Column(name="date_commande")
    @Temporal(TemporalType.DATE)
    private Date date_commande;
    @ManyToOne
    @JoinColumn(name="id")
    private Produit p;
    @ManyToOne
    @JoinColumn(name="username")
    private User u;
}
