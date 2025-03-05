package org.example.app_memento_2.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String titolo;

    @Column
    private boolean isEditable = false;

    @Column(nullable = false)
    private LocalDateTime created_at = LocalDateTime.now();

    @Column
    private LocalDateTime updated_at;

    @OneToMany(mappedBy = "notes")
    private List<Commento> commenti;

//    @ManyToOne
//    @JoinColumn(name = "updated_by")
//    private Users UpdatedBy;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "note")
    private List<Condivisione_nota> condivisioni;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Users utente;

    @OneToMany(mappedBy = "notaPrincipale")
    private List<Storico_Nota> storicoNote;

}
