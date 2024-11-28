package org.example.abirprojetpl.repository;

import org.example.abirprojetpl.entities.Chercheur;
import org.example.abirprojetpl.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication,Long> {

}
