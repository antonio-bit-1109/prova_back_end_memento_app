package org.example.app_memento_2.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Storico_Nota {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titoloNota;

    private String contenuto;

    private float versione;

    @Column(nullable = false)
    private LocalDateTime created_at = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Users utente;

    @ManyToOne
    @JoinColumn(name = "nota_principale_id")
    private Note notaPrincipale;

}
