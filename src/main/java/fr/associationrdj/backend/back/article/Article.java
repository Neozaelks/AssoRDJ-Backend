package fr.associationrdj.backend.back.article;

import fr.associationrdj.backend.back.categorie.Categorie;
import fr.associationrdj.backend.back.utilisateur.Utilisateur;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "article_categorie",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private Categorie categorie;
    @ManyToMany
    @JoinTable(
            name = "article_utilisateur",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id"))
    private Utilisateur utilisateur;
    private String titre;
    private String corps;
    private Date date_ecriture;
    private Date date_modif;
    private String like_dislike;//TODO


}
