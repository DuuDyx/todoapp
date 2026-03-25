package com.TODO.TODOAPP.model;
import jakarta.persistence.*;

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
    private String descrição;

    @Column(name = "status_atual")
    private boolean status_atual;

    @Column(name = "data_limite")
    private String data_limite;

    @Column(name = "data_inicio")
    private String data_inicio;



}
