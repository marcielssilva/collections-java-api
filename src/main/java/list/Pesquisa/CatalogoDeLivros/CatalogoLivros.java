package main.java.list.Pesquisa.CatalogoDeLivros;


import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livroPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro livro: livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(livro);
                }
            }
        }
        return livroPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
           for (Livro livro: livroList){
               if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                   livroPorIntervaloAnos.add(livro);
               }
           }
        }
        return livroPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro livro: livroList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}

