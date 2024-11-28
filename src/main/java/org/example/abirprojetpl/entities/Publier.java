package org.example.abirprojetpl.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Publier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Nouvelle clé primaire auto-générée

    // Relation avec Chercheur
    @ManyToOne
    @JoinColumn(name = "chno", insertable = false, updatable = false)
    private Chercheur chercheur;

    // Relation avec Publication
    @ManyToOne
    @JoinColumn(name = "pubno", insertable = false, updatable = false)
    private Publication publication;

    private int rang; // Le rang de l'auteur (1 pour l'auteur principal, 2 pour un auteur secondaire, etc.)

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Chercheur getChercheur() {
        return chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }
}