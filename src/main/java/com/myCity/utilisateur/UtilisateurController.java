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

    //utilisateurs/
    @GetMapping
    public Iterable<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    //utilisateurs/1
    @GetMapping("/{utilisateurId}")
    public Optional<Utilisateur> getUtilisateur(@PathVariable("utilisateurId") int utilisateurId) {
        return utilisateurRepository.findById(utilisateurId);
    }
    //utilisateurs/nom/Zuck
    @GetMapping("/nom/{utilisateurNom}")
    public List<Utilisateur> getUtilisateursByNom(@PathVariable("utilisateurNom") String nom){
        return utilisateurRepository.findAllByNomIsContaining(nom);
    }

    //utilisateurs/prenom/Marck
    @GetMapping("/prenom/{utilisateurPrenom}")
    public List<Utilisateur> getUtilisateursByPrenom(@PathVariable("utilisateurPrenom") String prenom){
        return utilisateurRepository.findByPrenomIsContaining(prenom);
    }

    //utilisateurs/email/zuck-marc@facebook.com
    @GetMapping("/email/{utilisateurEmail}")
    public Optional<Utilisateur> getUtilisateurByEmail(@PathVariable("utilisateurEmail") String email){
        return utilisateurRepository.findByEmail(email);
    }
}
