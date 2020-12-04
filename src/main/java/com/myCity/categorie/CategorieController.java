package com.myCity.categorie;


import com.myCity.incident.Incident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.myCity.categorie.*;
@RestController
@RequestMapping(path = "/categories")
public class CategorieController {
    @Autowired
    private CategorieRepository categorieRepository;

    //categories
    @GetMapping
    public Iterable<Categorie> getCategories() {
        return categorieRepository.findAll();
    }

    //categories/1
    @GetMapping("/{categorieId}")
    public Optional<Categorie> getCategorie(@PathVariable("categorieId") int categorieId) {
        return categorieRepository.findById(categorieId);
    }

    //categories/nom/animal
    @GetMapping("/nom/{nom}")
    public List<Categorie> getCategorie(@PathVariable("nom") String nom) {
        return categorieRepository.findAllByNomIsContaining(nom);
    }
}
