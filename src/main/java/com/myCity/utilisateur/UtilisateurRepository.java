package com.myCity.utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path ="utilisateur")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
