package com.TODO.TODOAPP.model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Task")
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public TaskModel(){}

    public TaskModel(Long id, String titulo, String descricao, boolean status_atual, LocalDate data_limite, LocalDate data_inicio) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status_atual = status_atual;
        this.data_limite = data_limite;
        this.data_inicio = data_inicio;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus_atual() {
        return status_atual;
    }

    public void setStatus_atual(boolean status_atual) {
        this.status_atual = status_atual;
    }

    public LocalDate getData_limite() {
        return data_limite;
    }

    public void setData_limite(LocalDate data_limite) {
        this.data_limite = data_limite;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }
}
