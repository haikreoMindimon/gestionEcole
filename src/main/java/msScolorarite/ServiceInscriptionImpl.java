package msScolorarite;

import msScolorarite.model.Inscription;
import msScolorarite.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;

@Service
public class ServiceInscriptionImpl
{
   @Autowired
   InscriptionRepository inscriptionRepository;


   public  Inscription createInscription(Inscription inscription){
      return    inscriptionRepository.save(inscription);
   }

   public Inscription getInscriptionByEleve(String matricule){
      return  inscriptionRepository.findByEleveMatricule(matricule);
   }

   public List<Inscription> getAllInscription(){
       return  inscriptionRepository.findAll();
   }

}
