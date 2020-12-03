package com.myCity.categorie;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Categorie {
    @Id
    private int categorie_id;
    private String nom;
}
