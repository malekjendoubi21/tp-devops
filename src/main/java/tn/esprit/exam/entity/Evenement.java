package tn.esprit.exam.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            int id ;
        String description ;
    @Temporal(TemporalType.DATE)

        Date dateDebut ;
    @Temporal(TemporalType.DATE)

    Date dateFin ;

        float cout ;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Participant> participants;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "evenement")
    private Set<Logistique> logistiques= new HashSet<Logistique>();

}

