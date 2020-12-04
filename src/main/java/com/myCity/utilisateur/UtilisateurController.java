package com.myCity.utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/utilisateurs")
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @GetMapping
    public Iterable<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @GetMapping("/{utilisateurId}")
    public Optional<Utilisateur> getUtilisateur(@PathVariable("utilisateurId") int utilisateurId) {
        return utilisateurRepository.findById(utilisateurId);
    }
    @GetMapping("/search/")
    public List<Utilisateur> getUtilisateursByNom(@RequestParam String nom){
        return utilisateurRepository.findAllByNomIsContaining(nom);
    }
}
