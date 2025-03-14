package tn.esprit.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Evenement;
@Repository

public interface EvenementReponsitory extends JpaRepository<Evenement, Integer> {
}
