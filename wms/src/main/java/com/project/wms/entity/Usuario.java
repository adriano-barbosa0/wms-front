package com.project.wms.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", length = 200, nullable = true)
    private String nome;
    @Column(name = "email", length = 50, nullable = true)
    private String email;
    @Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;
    @Column(name = "telefone", length = 15, nullable = true)
    private String telefone;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
