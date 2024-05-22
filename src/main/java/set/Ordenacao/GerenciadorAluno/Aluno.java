package main.java.set.Ordenacao.GerenciadorAluno;

import java.util.Comparator;
import java.util.Objects;

public class Aluno {
    //ATRIBUTOS
    private String nome;
    private long matricula;
    private double media;

    //CONSTRUTOR
    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public double getMedia() {
        return media;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}
class ComparatorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
