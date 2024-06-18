package ch.bbw.backend.services;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;

}

