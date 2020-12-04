package com.myCity.categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "categories")
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
    List<Categorie> findAllByNomIsContaining(String nom);

    Optional<Categorie> findById(Integer categorieId);
}
