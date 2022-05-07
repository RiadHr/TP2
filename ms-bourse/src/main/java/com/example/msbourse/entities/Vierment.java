package com.example.msbourse.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor
public class Vierment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVierment;

    private float Montant;

    @Temporal(TemporalType.DATE)
    private Date dateVierment;

    @OneToMany(mappedBy = "vierment")
    private List<Etudiant> etudiants;


}
