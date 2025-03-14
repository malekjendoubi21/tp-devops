package tn.esprit.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Logistique;

@Repository

public interface LogistiqueRepository extends JpaRepository<Logistique, Integer> {
}
