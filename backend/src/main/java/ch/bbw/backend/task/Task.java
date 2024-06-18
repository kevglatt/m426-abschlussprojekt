package ch.bbw.backend.task;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private boolean completed;
    @Enumerated(EnumType.STRING)
    @Column
    private Priority priority;
    @Column
    private Date due;
    @Column
    private Date createdAt;
}