package msScolorarite.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Eleve {
    @Id @Column( nullable)
    private String matricule;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private Date dateNaissance;
    @Column
    private String NNI;
    @Column
    private String anneeScolaire;
    @Column
    private String niveau;


}
