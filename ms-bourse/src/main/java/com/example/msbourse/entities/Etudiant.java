package com.example.msbourse.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private Long nCompteCCP;

    private Float SallaireParent;

    private boolean SituationImpots;


    @ManyToOne
    private Vierment vierment;

}
