package msScolorarite.repository;

import msScolorarite.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {

    Inscription findByEleveMatricule(String matricule);
}
