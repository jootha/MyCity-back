package com.myCity.categorie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import com.myCity.categorie.*;
@RestController
@RequestMapping(path = "/categories")
public class CategorieController {
    @Autowired
    private CategorieRepository categorieRepository;

    @GetMapping
    public Iterable<Categorie> getCategories() {
        return categorieRepository.findAll();
    }

    @GetMapping("/{categorieId}")
    public Optional<Categorie> getCategorie(@PathVariable("categorieId") int categorieId) {
        return categorieRepository.findById(categorieId);
    }
}
