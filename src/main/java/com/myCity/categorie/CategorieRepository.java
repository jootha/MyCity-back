package com.myCity.categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "categorie")
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}
