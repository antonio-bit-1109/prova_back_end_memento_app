package org.example.app_memento_2.entities;

import jakarta.persistence.*;

@Entity
public class Permessi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "consenso1")
    private boolean consenso1;

    @Column(nullable = false, name = "consenso2")
    private boolean consenso2;

    @Column(nullable = false, name = "consenso3")
    private boolean consenso3;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
}
