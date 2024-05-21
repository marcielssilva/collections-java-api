package main.java.list.Ordenacao.OrdenacaoPessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    // atributos
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
class ComparatorPorAltura implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p, Pessoa p2) {
        return Double.compare(p.getAltura(), p2.getAltura());
    }
}