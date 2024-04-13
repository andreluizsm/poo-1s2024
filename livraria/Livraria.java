package livraria;

import java.util.ArrayList;

public class Livraria {

    public ArrayList <Livro> livros;

    public Livraria(){
        this.livros = new ArrayList<>();
    }
    
    public void cadastrarLivro(Livro livro){
        this.livros.add(livro);
    }

    public String listarLivros(){
        String listaLivros = "";
        for (Livro l : this.livros) {
            listaLivros += l.id + " - " + l.titulo + "\n";
        }
        return listaLivros;
    }

    public String detalharLivro(int id) {
        for (Livro l : this.livros) {
            if (l.id == id) {
                return "Detalhes do Livro:\n" +
                       "ID: " + l.id + "\n" +
                       "Título: " + l.titulo + "\n" +
                       "Autor: " + l.nomeAutor + "\n" +
                       "Ano de Publicação: " + l.anoPublicacao + "\n" +
                       "Editora: " + l.editora + "\n";
            }
        }
        return "Livro não encontrado.";
    }
}

