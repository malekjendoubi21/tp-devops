package tn.esprit.exam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Logistique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            int idLog ;
        String description ;
        boolean reserve;
        float prixUnit ;
        int quantite ;
    @ManyToOne
    @ToString.Exclude
    @JsonIgnore
    private Evenement evenement;
}
