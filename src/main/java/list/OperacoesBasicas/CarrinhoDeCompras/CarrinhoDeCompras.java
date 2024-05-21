package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // atributo
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item item : itemList) {
                if (item.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(item);
                }
            }
            itemList.removeAll(itemParaRemover);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
    public double calcularTotal(){
        double valorTotal = 0d;
        if (!itemList.isEmpty()){
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; // valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }
    public void exibirItens(){
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println( "A lista esta vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularTotal());
    }
}
