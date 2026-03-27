package com.TODO.TODOAPP.controller;

import java.time.LocalDate;

public class TaskDTO {
    private String titulo;
    private String descricao;
    private boolean status_atual;
    private LocalDate data_limite;
    private LocalDate data_inicio;

    public TaskDTO() {
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
