package br.ufjf.dcc196.trabalho1_ramon_douglas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Participante implements Serializable {
    private String nome;
    private String email;
    private String cpf;
    private List<Evento> eventos;

    public Participante() {
    }

    public Participante(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.eventos = new ArrayList<Evento>();
    }

    public Participante(String nome, String email, String cpf, List<Evento> eventos) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.eventos = eventos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
