package main.java.set.Ordenacao.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    //COMPARADOR POR NOME DE PRODUTO
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    // ATRIBUTOS
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    // CONTRUTOR
    public Produto(long cod, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cod = cod;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCod() {
        return cod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    // TO STRING
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", cod=" + cod +
                '}';
    }
}

// CRIA UMA NOVA CLASSE COMPARATOR
class ComparatorPorPreco implements Comparator<Produto> {
    // metodo PRA COMPARAR POR PRECO
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
