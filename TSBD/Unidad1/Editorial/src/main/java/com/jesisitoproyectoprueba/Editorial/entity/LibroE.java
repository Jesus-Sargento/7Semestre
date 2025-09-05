package com.jesisitoproyectoprueba.Editorial.entity;

import com.jesisitoproyectoprueba.Editorial.controller.Autor;
import jakarta.persistence.*;

@Entity
public class LibroE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_libro;

    @Column(nullable = false)
    private String titulo;

    private Integer publicacion;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private AutorE autor;

    public Long getId_libro() {
        return id_libro;
    }

    public void setId_libro(Long id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Integer getpublicacion() {
        return publicacion;
    }

    public void setpublicacion(Integer publicacion) {
        this.publicacion = publicacion;
    }

    public AutorE getAutor() {
        return autor;
    }

    public void setAutor(AutorE autor) {
        this.autor = autor;
    }
}
