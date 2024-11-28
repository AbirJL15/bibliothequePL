package org.example.abirprojetpl.repository;

import org.example.abirprojetpl.entities.Chercheur;
import org.example.abirprojetpl.entities.Publier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublierRepository extends JpaRepository<Publier, Long> {

    List<Publier> findByChercheur_Chno(Integer chno);

    List<Publier> findByPublication_Pubno(Long pubno);
}
