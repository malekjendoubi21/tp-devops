package tn.esprit.exam.service;

import tn.esprit.exam.entity.Participant;

import java.util.List;

public interface IParticipantService {
    public List<Participant> retrieveAllParticipants();
    public Participant retrieveParticipant(int idPart);
    public Participant ajouterParticipant(Participant p);
    public void removeParticipant(int idPart);
    public Participant modifyParticipant(Participant participant);
}
