package com.example.Biblioteca;

import jakarta.persistence.*;

//JPA = Java persistence API
//Entity transforma uma classe em uma entidade do Banco de dados.
@Entity
//Table Cria uma tabela com as colunas(Definindo o nome da tabela inteira!)
@Table(name = "tb_cadastro")
public class BookModel {

        //Definindo o ID com a annotation
        @Id
        //Passando a estrategia de definir a sequencia dos ID's
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String nome;
        String autor;
        int anoPublicacao;

    public BookModel() {
    }

    public BookModel(Long id, String nome, String autor, int anoPublicacao) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
