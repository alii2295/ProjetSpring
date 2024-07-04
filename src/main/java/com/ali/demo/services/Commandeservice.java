package com.ali.demo.services;


import com.ali.demo.model.Commande;
import com.ali.demo.repository.Commanderepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Commandeservice {
    @Autowired
    private Commanderepository cr;
    public Commande create_commande(Commande c)
    {
        return
                cr.save(c);
    }
    public Commande get_commande(long id)
    {
        return cr.findById(id).orElse(null);
    }
    public void delete_commande(long id)
    {
         cr.deleteById(id);

    }
    /*public put_commande(long id , Commande commande)
    {
        Commande cmd =cr.findById(id).orElse(null);
        if (cmd != null)
        {
            cmd.setId_commande(commande.getId_commande());
            cmd.setUser(commande.getUsers());
            cmd.setProduits(commande.getProduits());
            return cr.save(commande);
        }
        else
        {
            return null;
        }
    }
    */


}
