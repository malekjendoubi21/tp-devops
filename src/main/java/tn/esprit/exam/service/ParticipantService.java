package tn.esprit.exam.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.Participant;
import tn.esprit.exam.repository.ParticipantRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ParticipantService implements  IParticipantService{
    ParticipantRepository participantRepository;

    //@Scheduled(cron = "0/15 * * * * *")
    // @Scheduled(fixedDelay = 10000) // 10000 millisecondes
    public List<Participant> retrieveAllParticipants() {
        List<Participant> listC = participantRepository.findAll();
        log.info("nombre total des participants : " + listC.size());
        for (Participant c: listC) {
            log.info("participant : " + c);
        }
        return listC;
    }

    public Participant retrieveParticipant(int idPart) {
        Participant c = participantRepository.findById(idPart).get();
        return c;
    }

    public Participant ajouterParticipant(Participant p) {
        Participant participant = participantRepository.save(p);
        return participant;
    }

    public Participant modifyParticipant(Participant participant) {
        Participant c = participantRepository.save(participant);
        return c;
    }

    public void removeParticipant(int idPart) {
        participantRepository.deleteById(idPart);
    }
}
