package org.example.abirprojetpl.controller;

import org.example.abirprojetpl.entities.Chercheur;
import org.example.abirprojetpl.entities.Publier;
import org.example.abirprojetpl.service.ChercheurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chercheurs")
public class ChercheurController {

    @Autowired
    private ChercheurService chercheurService;

    // Récupérer tous les chercheurs
    @GetMapping
    public List<Chercheur> getAllChercheurs() {
        return chercheurService.getAllChercheurs();
    }
    // Récupérer un chercheur par son chno
    @GetMapping("/{chno}")
    public Chercheur getChercheur(@PathVariable int chno) {
        return chercheurService.getChercheurByChno(chno);
    }
    // Ajouter un chercheur
    @PostMapping
    public Chercheur addChercheur(@RequestBody Chercheur chercheur) {
        return chercheurService.addChercheur(chercheur);

    }


    // Supprimer un chercheur
    @DeleteMapping("/{chno}")
    public void deleteChercheur(@PathVariable int chno) {
        chercheurService.deleteChercheur(chno);
    }

    // Endpoint pour récupérer les chercheurs dans un laboratoire
    @GetMapping("/lab/{labno}")
    public List<Chercheur> getResearchersInLaboratory(@PathVariable Long labno) {
        return chercheurService.getResearchersInLaboratory(labno);
    }

    // Endpoint pour récupérer les publications d'un chercheur
    @GetMapping("/{chno}/publications")
    public List<Publier> getPublicationsByChercheur(@PathVariable Integer chno) {
        return chercheurService.getPublicationsByChercheur(chno);
    }
}