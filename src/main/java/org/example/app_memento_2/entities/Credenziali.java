package org.example.app_memento_2.entities;

import jakarta.persistence.*;

@Entity
public class Credenziali {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
}
