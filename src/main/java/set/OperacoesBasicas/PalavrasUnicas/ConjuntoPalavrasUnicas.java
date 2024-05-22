package main.java.set.OperacoesBasicas.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributo
    private Set<String> palavrasUnicasSet;

    // construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    // adiciona palavras ao hash set
    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    // remover palavras do hash set
    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.contains(palavra)) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto");
            }
        } else {
            System.out.println("O Conjunto está Vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

        // exibir palavras unicas do hashset
        public void exibirPalavrasUnicas () {
            if (!palavrasUnicasSet.isEmpty()) {
                System.out.println("Palavras: " + palavrasUnicasSet);
            } else {
                System.out.println("O Conjunto está Vazio.");
            }
        }

    public static void main(String[] args) {
        // cria instancia da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // adiciona linguagens ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("Kotlin");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // exibindo linguagens unicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // removendo linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Kotlin");

        // removendo linguagem inexistente no conjunto
        conjuntoLinguagens.removerPalavra("Switft");

        // verificando se a linguagem está no conjunto
        System.out.println("A Linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A Linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("C++"));

        // exibir linguagens unicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}

