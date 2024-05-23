package main.java.set.Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    //ATRIBUTO
    private Set<Produto> produtoSet;

    // CONSTRUCTOR
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // METODO ADICIONAR PRODUTO
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        // TREESET PARA ORDENAR O SET
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtoPorPreco;
    }

    //METODO MAIN
    public static void main(String[] args) {
        //INSTANCIA OU INICIA O OBJETO CADASTRO PRODUTOS
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // ADICIONA PRODUTOS
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtoSet);

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
