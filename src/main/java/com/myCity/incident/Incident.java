package com.myCity.incident;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Incident {

    @Id
    private int auteur;
    private String type;
    private String titre;
    private String description;
    private String adresse;
    private Date ouverture;
    private Date fermeture;
    private String statut;
}
