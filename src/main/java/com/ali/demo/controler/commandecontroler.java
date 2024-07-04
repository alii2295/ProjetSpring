package com.ali.demo.controler;

import com.ali.demo.model.Commande;
import com.ali.demo.services.Commandeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/commande")
@RestController
public class commandecontroler {
    @Autowired
    private Commandeservice cs;
    @PostMapping("/ajouter")
    public Commande create_commande(@RequestBody Commande cmd)
    {
       return cs.create_commande(cmd);
    }
    @GetMapping("/{id}")
    public Commande get_commande(@PathVariable long id)
    {
        return cs.get_commande(id);
    }



}


