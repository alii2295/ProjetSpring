package com.ali.demo.services;
import com.ali.demo.model.Categorie;
import com.ali.demo.model.Produit;
import com.ali.demo.repository.Categorierepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Categorieservice {
    @Autowired
    private Categorierepository c;
    public Categorie create_categorie(Categorie cc)
    {
        return
                c.save(cc);
    }

    public Categorie get_categorie(long id)
    {
        return c.findById(id).orElse(null);

    }
    public void delete_categorie(long id)
    {
        c.deleteById(id);
    }

    public Categorie put_categorie(long id, Categorie cc)
    {
        Categorie ce= c.findById(id).orElse(null);
        if (ce != null)
        {
            ce.setName(cc.getName());
            return c.save(cc);
        }
        else
        {
            return null;
        }









    }
}
