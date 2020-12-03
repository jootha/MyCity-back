package com.myCity.utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
