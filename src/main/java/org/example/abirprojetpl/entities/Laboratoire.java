package org.example.abirprojetpl.entities;
import jakarta.persistence.*;



@Entity
public class Laboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long labno; // Numéro du laboratoire

    private String labnom; // Nom du laboratoire

    @ManyToOne
    @JoinColumn(name = "facno")
    private Faculte faculte; // Faculté à laquelle le laboratoire est rattaché

    // Getters et Setters
}
