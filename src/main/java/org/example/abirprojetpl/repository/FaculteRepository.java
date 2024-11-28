package org.example.abirprojetpl.repository;

import org.example.abirprojetpl.entities.Chercheur;
import org.example.abirprojetpl.entities.Faculte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FaculteRepository extends JpaRepository<Faculte, Long> {
}

