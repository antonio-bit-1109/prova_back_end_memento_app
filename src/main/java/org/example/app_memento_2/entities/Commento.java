package org.example.app_memento_2.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Commento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String testo;
    @Column(nullable = false)
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn(name = "note_id")
    private Note notes;
}
