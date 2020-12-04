package com.myCity.utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path ="utilisateurs")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    List<Utilisateur> findAllByNomIsContaining(String nom);
    Optional<Utilisateur> findById(int id);

    Optional<Utilisateur> findByEmail(String email);
}
