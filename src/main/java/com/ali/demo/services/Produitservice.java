package com.ali.demo.services;
import com.ali.demo.model.Categorie;
import com.ali.demo.model.Produit;
import com.ali.demo.repository.Categorierepository;
import com.ali.demo.repository.Produitrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Produitservice {
    @Autowired
    private Produitrepository p;
    @Autowired
    private Categorierepository catp;
    public Produit create_produit(Produit pp, long id_cat) {
        // Recherche de la catégorie par son identifiant
        Optional<Categorie> catgOptional = catp.findById(id_cat);

        // Vérification si la catégorie a été trouvée
        if (catgOptional.isPresent()) {
            // Récupération de la catégorie à partir de l'Optional
            Categorie categorie = catgOptional.get();

            // Attribution de la catégorie au produit
            pp.setCategorie(categorie);

            // Sauvegarde du produit avec la catégorie assignée
            return p.save(pp);
        } else {
            // Si la catégorie n'a pas été trouvée, lancer une exception
            throw new RuntimeException("categ nes pas trouvée") ;
        }
    }


    public Produit get_produit(long id)
    {
        return
                p.findById(id).orElse(null);
    }
    public void delete_produit(long id)
    {
                p.deleteById(id);
    }

    public Produit put_produit(long id, Produit pp)
    {
        Produit pe= p.findById(id).orElse(null);
        if (pe != null)
        {
            pe.setName(pp.getName());
            pe.setPrice(pp.getPrice());
            return p.save(pp);
        }
        else
        {
            return null;
        }
    }

}
