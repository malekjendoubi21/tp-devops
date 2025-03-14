package tn.esprit.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Participant;
@Repository

public interface ParticipantRepository extends JpaRepository<Participant, Integer>
        {
}
