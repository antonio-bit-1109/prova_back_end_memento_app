package org.example.app_memento_2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 100)
    private String cognome;
    @Column(nullable = false, length = 100)
    private boolean isMale;
    @Column(nullable = false, length = 100)
    private String telefono;
    @Column(nullable = false, length = 16)
    private String cf;
    @Column(nullable = false)
    private LocalDate dataNascita;
    @Column(nullable = false)
    private boolean isActive = true;
    @Column(nullable = false)
    private LocalDateTime created_at = LocalDateTime.now();
    @Column
    private LocalDateTime updated_at;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Credenziali credenziali;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Permessi permessi;

    //@ManyToMany()
    @OneToMany(mappedBy = "user")
    private List<Condivisione_nota> condivisioni;

    @OneToMany(mappedBy = "user")
    private List<Note> listaNote;

}
