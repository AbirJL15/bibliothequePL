package org.example.abirprojetpl.controller;

import org.example.abirprojetpl.entities.Publication;
import org.example.abirprojetpl.entities.Publier;
import org.example.abirprojetpl.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/publications") //ne fonctionne pas
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    // Endpoint pour récupérer les auteurs liés à une publication
    @GetMapping("/{pubno}/authors")
    public ResponseEntity<List<Publier>> getAuthorsByPublication(@PathVariable Long pubno) {
        try {
            List<Publier> authors = publicationService.getAuthorsByPublication(pubno);
            return ResponseEntity.ok(authors);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    // Endpoint pour récupérer une publication par son ID
    @GetMapping("/{pubno}")
    public ResponseEntity<Publication> getPublicationById(@PathVariable Long pubno) {
        try {
            Publication publication = publicationService.getPublicationById(pubno);
            return ResponseEntity.ok(publication);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}