package com.ali.demo.controler;
import com.ali.demo.model.Produit;
import com.ali.demo.services.Produitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/produit")
@RestController
public class produitcontroler {
    @Autowired
    private Produitservice ps;//injection de dependences
    @PostMapping("/ajouter")
    public Produit create_produit(@RequestBody Produit p, @RequestParam long id_cat) {
        return ps.create_produit(p, id_cat);
    }

    @GetMapping ("/{id}")
    public Produit get_id(@PathVariable long id)
    {
        return ps.get_produit(id);
    }
    @DeleteMapping("/{id}")
    public void delete_product(@PathVariable long id)
    {
         ps.delete_produit(id);
    }
    @PutMapping ("/{id}")
    public Produit put_product(@PathVariable long id,@RequestBody Produit pp )
    {
        return ps.put_produit(id,pp);
    }
}
