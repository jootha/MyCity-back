package com.myCity.incident;

import com.myCity.categorie.Categorie;
import com.myCity.categorie.CategorieRepository;
import com.myCity.utilisateur.Utilisateur;
import com.myCity.utilisateur.UtilisateurRepository;
import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/incidents")
public class IncidentController {

    @Autowired
    private IncidentRepository incidentRepository;
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    private CategorieRepository categorieRepository;

    @GetMapping
    public Iterable<Incident> getIncidents() {
        return incidentRepository.findAll();
    }

    //incidents/1
    @GetMapping("/{incidentId}")
    public Optional<Incident> getIncident(@PathVariable("incidentId") int incidentId) {
        return incidentRepository.findById(incidentId);
    }

    //incidents/titre/Shib
    @GetMapping("/titre/{titre}")
    public List<Incident> getIncidentByTitre(@PathVariable("titre") String titre) {
        return incidentRepository.findAllByTitreIsContaining(titre);
    }
    //incidents/utilisateur/1
    @GetMapping("/utilisateur/{utilisateurId}")
    public List<Incident> getIncidentByUtilisateurId(@PathVariable("utilisateurId") int utilisateurId) {
        return incidentRepository.findAllByAuteur(utilisateurRepository.findById(utilisateurId));
    }
    //incidents/categorie/1
    @GetMapping("/categorie/{categorieId}")
    public List<Incident> getIncidentByCategorieId(@PathVariable("categorieId") int categorieId) {
        return incidentRepository.findAllByCategorie(categorieRepository.findById(categorieId));
    }
    //incidents/statut/1
    @GetMapping("/statut/{statut}")
    public List<Incident> getIncidentByStatut(@PathVariable("statut") String statut) {
        return incidentRepository.findByStatut(statut);
    }
}
