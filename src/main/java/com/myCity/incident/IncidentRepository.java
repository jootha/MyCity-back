package com.myCity.incident;

import com.myCity.categorie.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.myCity.utilisateur.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RepositoryRestResource(path = "incidents")
public interface IncidentRepository extends JpaRepository<Incident, Integer> {
    //Optional<Incident> findByTitre(String titre);
    List<Incident> findAllByTitreIsContaining(String titre);
    List<Incident> findAllByAuteur(Optional<Utilisateur> utilisateur);

    List<Incident> findAllByCategorie(Optional<Categorie> categorie);

    List<Incident> findByStatut(String statut);
}
