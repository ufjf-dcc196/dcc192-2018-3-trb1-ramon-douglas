package br.ufjf.dcc196.trabalho1_ramon_douglas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.ArrayList;
import java.util.Calendar;

public class Evento implements Serializable {
    private String titulo;
    private String facilitador;
    private String data;
    private String hora;
    private String descricao;
    private List<Participante> participantes;

    public Evento() {
    }

    public Evento(String titulo, String facilitador, String data, String hora, String descricao) {
        this.titulo = titulo;
        this.facilitador = facilitador;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.participantes = new ArrayList<Participante>();
    }

    public Evento(String titulo, String data, String hora, String facilitador, String descricao, List<Participante> participantes) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
        this.facilitador = facilitador;
        this.descricao = descricao;
        this.participantes = participantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFacilitador() {
        return facilitador;
    }

    public void setFacilitador(String facilitador) {
        this.facilitador = facilitador;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }
}
