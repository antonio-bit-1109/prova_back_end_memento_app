package org.example.app_memento_2.entities;

import jakarta.persistence.*;

@Entity
public class Condivisione_nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "note_id", nullable = false)
    private Note note;

    @Column(nullable = false)
    private String privilegi;

    @Column(nullable = false)
    private boolean isOwner;
}
