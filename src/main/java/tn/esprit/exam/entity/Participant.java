package tn.esprit.exam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPart ;

   String nom ;
   String prenom ;


    @Enumerated(EnumType.STRING)
    Tache tache;


    @ManyToMany(mappedBy = "participants")
    @JsonIgnore
    @ToString.Exclude
    private Set<Evenement> evenements;



}
