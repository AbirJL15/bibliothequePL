package org.example.abirprojetpl.repository;

import org.example.abirprojetpl.entities.Chercheur;
import org.example.abirprojetpl.entities.Laboratoire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaboratoireRepository extends JpaRepository<Laboratoire, Long> {
}

