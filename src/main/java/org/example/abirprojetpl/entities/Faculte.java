package org.example.abirprojetpl.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Faculte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facno; // Numéro de la faculté

    private String facnom; // Nom abrégé de la faculté
    private String adresse; // Adresse de la faculté
    private String libelle; // Nom complet de la faculté

    @OneToMany(mappedBy = "faculte")
    private List<Laboratoire> laboratoires; // Liste des laboratoires rattachés à cette faculté

    // Getters et Setters
    public Long getFacno() {
        return facno;
    }

    public void setFacno(Long facno) {
        this.facno = facno;
    }

    public String getFacnom() {
        return facnom;
    }

    public void setFacnom(String facnom) {
        this.facnom = facnom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Laboratoire> getLaboratoires() {
        return laboratoires;
    }

    public void setLaboratoires(List<Laboratoire> laboratoires) {
        this.laboratoires = laboratoires;
    }
}