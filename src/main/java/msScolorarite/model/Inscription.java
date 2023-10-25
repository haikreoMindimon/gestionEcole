package msScolorarite.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Inscription")
public class Inscription {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long InscriptionId;
    @Column
    private String eleveMatricule;
    @Column
    private String niveauId;
    @Column
    private  String anneeScolaire;
    @Column
    private int MontantPaye;
    @Column
    private Date DateInscription;
}
