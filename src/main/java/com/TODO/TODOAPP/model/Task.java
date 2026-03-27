package com.TODO.TODOAPP.model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int task_id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "status_atual")
    private boolean status_atual;

    @Column(name = "data_limite")
    private LocalDate data_limite;

    @Column(name = "data_inicio")
    private LocalDate data_inicio;



}
