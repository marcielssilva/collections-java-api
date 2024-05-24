package main.java.map.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.util.Collections;

public class Evento {
    // atributo
    private String titulo;
    private String atracao;

    public Evento(String titulo, String atracao){
        this.titulo = titulo;
        this.atracao = atracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "titulo='" + titulo + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
