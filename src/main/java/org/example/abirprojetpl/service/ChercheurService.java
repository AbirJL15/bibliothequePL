package org.example.abirprojetpl.service;

import org.example.abirprojetpl.entities.Chercheur;
import org.example.abirprojetpl.entities.Publier;
import org.example.abirprojetpl.repository.ChercheurRepository;
import org.example.abirprojetpl.repository.PublierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChercheurService {
    @Autowired
    private ChercheurRepository chercheurRepository;

    @Autowired
    private PublierRepository publierRepository;
    public List<Chercheur> getAllChercheurs() {
        return chercheurRepository.findAll();
    }
    public Chercheur getChercheurByChno(int chno) {
        return chercheurRepository.findById((long) chno).orElseThrow(() -> new RuntimeException("Chercheur not found"));
    }

    public Chercheur addChercheur(Chercheur chercheur) {
        return chercheurRepository.save(chercheur);
    }

    public Chercheur updateChercheur(int chno, Chercheur chercheur) {
        if (chercheurRepository.existsById((long) chno)) {
            chercheur.setChno(chno);
            return chercheurRepository.save(chercheur);
        } else {
            throw new RuntimeException("Chercheur not found");
        }
    }
    public void deleteChercheur(int chno) {
        chercheurRepository.deleteById((long) chno);
    }
    // Récupérer les publications d'un chercheur
    public List<Publier> getPublicationsByChercheur(Integer chno) {
        return publierRepository.findByChercheur_Chno(chno);  // Utilise un repository Publier pour récupérer les publications
    }

    // Récupérer les chercheurs associés à un laboratoire
    public List<Chercheur> getResearchersInLaboratory(Long labno) {
        return chercheurRepository.findByLaboratoire_Labno(labno);  // Récupérer les chercheurs par laboratoire
    }
}