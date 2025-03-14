package tn.esprit.exam.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.Participant;
import tn.esprit.exam.service.IParticipantService;
import java.util.List;

@Tag(name = "Ce Web Service gère le CRUD pour une Participant")
@RestController
@AllArgsConstructor
@RequestMapping("/Participant")
public class ParticipantRestController {

    IParticipantService ParticipantService;

    // http://localhost:8089/exam/Participant/retrieve-all-Participants
    @Operation(description = "Ce web service permet de récupérer toutes les Participants de la base de données")
    @GetMapping("/retrieve-all-Participants")
    public List<Participant> getParticipants() {
        List<Participant> listParticipants = ParticipantService.retrieveAllParticipants();
        return listParticipants;
    }/*
    // http://localhost:8089/exam/Participant/retrieve-Participant/8
    @GetMapping("/retrieve-Participant/{Participant-id}")
    public Participant retrieveParticipant(@PathVariable("Participant-id") Long chId) {
        Participant Participant = ParticipantService.retrieveParticipant(chId);
        return Participant;
    }*/
/*
    // http://localhost:8089/exam/Participant/add-Participant
    @PostMapping("/add-Participant")
    public Participant addParticipant(@RequestBody Participant c) {
        Participant participant = ParticipantService.ajouterParticipant(c);
        return participant;
    }
*/
    @PostMapping("/addParticipant")
    public Participant addFoyer(@RequestBody Participant participant) {
        return ParticipantService.ajouterParticipant(participant);
    }

/*
    // http://localhost:8089/exam/Participant/remove-Participant/{Participant-id}
    @DeleteMapping("/remove-Participant/{Participant-id}")
    public void removeParticipant(@PathVariable("Participant-id") Long chId) {
        ParticipantService.removeParticipant(chId);
    }

    // http://localhost:8089/exam/Participant/modify-Participant
    @PutMapping("/modify-Participant")
    public Participant modifyParticipant(@RequestBody Participant c) {
        Participant Participant = ParticipantService.modifyParticipant(c);
        return Participant;
    }*/
}
