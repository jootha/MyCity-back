package com.myCity.utilisateur;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private String role;

    @Column(nullable = true)
    private boolean alert;// Will my user will receives the alerts of incidents.

}
