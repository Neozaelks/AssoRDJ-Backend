package fr.associationrdj.backend.back.reservation;

import fr.associationrdj.backend.back.salle.Salle;
import fr.associationrdj.backend.back.utilisateur.Utilisateur;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Salle salle;
    @ManyToMany
    @JoinTable(
            name = "reservation_utilisateur",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id"))
    private Utilisateur utilisateur;
    private int participant;
    private boolean validation;
    private Date date_reservation;
    private LocalDate creneau;
    private Date date_evenement;
    private String description;
}
