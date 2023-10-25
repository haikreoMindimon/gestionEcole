package msScolorarite.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Niveau {
    @Id @Column
    private String niveauId;
    @Column
    private String description;
    @Column
    private int MontantInscription;
    @Column
    private int MontantMensualite;
    @Column
    private int  TotalScolarite;
}
