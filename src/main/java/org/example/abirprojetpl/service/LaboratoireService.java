package org.example.abirprojetpl.service;


import org.example.abirprojetpl.entities.Chercheur;
import org.example.abirprojetpl.repository.ChercheurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratoireService {

    @Autowired
    private ChercheurRepository chercheurRepository;

    // Récupérer les chercheurs d'un laboratoire
    public List<Chercheur> getResearchersInLaboratory(Long labno) {
        return chercheurRepository.findByLaboratoire_Labno(labno);
    }
}
