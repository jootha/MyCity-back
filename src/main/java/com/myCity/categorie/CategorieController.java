package com.myCity.categorie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
