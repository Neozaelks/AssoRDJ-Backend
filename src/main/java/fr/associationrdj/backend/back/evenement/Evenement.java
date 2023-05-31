package fr.associationrdj.backend.back.evenement;

import com.fasterxml.jackson.databind.DatabindException;
import fr.associationrdj.backend.back.categorie.Categorie;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "evenements")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "evenement_categorie",
            joinColumns = @JoinColumn(name = "evenement_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private List<Categorie> categories;
    private String nom;
    private Date dateCreation;
    private Date dateDebut;
    private Date dateFin;
    private String descritpion;


}
