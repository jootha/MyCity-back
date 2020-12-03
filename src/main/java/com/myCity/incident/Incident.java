package com.myCity.incident;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Incident {

    @Id
    private int auteur;
    private String type;
    private String titre;
}
