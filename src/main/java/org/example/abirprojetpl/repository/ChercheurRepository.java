package org.example.abirprojetpl.repository;

import org.example.abirprojetpl.entities.Chercheur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChercheurRepository extends JpaRepository<Chercheur, Long> {

    List<Chercheur> findByLaboratoire_Labno(Long labno);
}

