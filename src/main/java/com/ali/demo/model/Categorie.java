package com.ali.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.nio.MappedByteBuffer;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cat ;
    private String name;
    @OneToMany( mappedBy ="categorie")
    private List<Produit> produits;
    public long getId_cat() {
        return id_cat;
    }
    public String getName() {
        return name;
    }
    public void setId_cat(long id_cat) {
        this.id_cat = id_cat;
    }
    public void setName(String name) {
        this.name = name;
    }
}
