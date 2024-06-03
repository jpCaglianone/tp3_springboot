package com.example.tp3_springboot.model.core;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "materialDidatico")
public class MaterialDidatico {

    @Id
    private String id;
    private String titulo;
    private String descricao;
    private String autor;

    // Getters and Setters
    // Construtores

    public MaterialDidatico() {
    }

    public MaterialDidatico(String titulo, String descricao, String autor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
