package main.java.list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
   // atributos

    private List<Integer> numerosList;

    // construtor
    public SomaNumeros() {
    this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numerosList) {
            soma = numero + soma;
        }
            return soma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer numero : numerosList) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException(" A Lista esta Vazia");
        }
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer numero : numerosList) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException(" A Lista esta Vazia");
        }
    }
    public void exibirNumeros(){
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        }else{
            System.out.println("A Lista esta Vazia");
        }
    }

    public static void main(String[] args) {

        // criando instancia da classe

        SomaNumeros somaNumeros = new SomaNumeros();

        // adicionando valores
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);

        // exibindo numeros adicionados
        System.out.println("Numeros Adicionados: ");
        somaNumeros.exibirNumeros();

        // calculando e exibindo soma dos numeros da lista
        System.out.println("Soma dos numeros : " + somaNumeros.calcularSoma());

        // exibindo maior valor da lista
        System.out.println("Maior numero : " + somaNumeros.encontrarMaiorNumero());

        // exibindo menor valor da lista
        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
    }
}

