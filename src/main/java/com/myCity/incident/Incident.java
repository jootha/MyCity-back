package com.myCity.incident;
import  com.myCity.utilisateur.*;
import  com.myCity.categorie.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int incident_id;

    @ManyToOne
    private Utilisateur auteur;
    private String type;
    private String titre;

    @ManyToOne
    private Categorie categorie;
    private String description;
    private String adresse;
    private Date ouverture;
    private Date fermeture;
    private String statut;

}
