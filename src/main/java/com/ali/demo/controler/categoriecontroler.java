package com.ali.demo.controler;
import com.ali.demo.model.Categorie;
import com.ali.demo.services.Categorieservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/categorie")
@RestController
public class categoriecontroler {
    @Autowired
    private Categorieservice cs ;

    @PostMapping("/ajouter")
    public Categorie create_categorie(@RequestBody Categorie c)
    {
        return cs.create_categorie(c);
    }

    @GetMapping("/{id}")
    public Categorie get_id(@PathVariable long id)
    {
        return cs.get_categorie(id);
    }

    @DeleteMapping("/{id}")
    public void delete_categorie(@PathVariable long id)
    {
        cs.delete_categorie(id);
    }

    @PutMapping ("/{id}")
    public Categorie put_categorie(@PathVariable long id,@RequestBody Categorie c )
    {
        return cs.put_categorie(id,c);
    }
}








