package com.jesisitoproyectoprueba.Editorial.entity;
import com.jesisitoproyectoprueba.Editorial.controller.Libro;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class AutorE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_autor;

    @Column(nullable = false)
    private String nombre;

    private String nacionalidad;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<LibroE> libros;

    public Long getId_autor() {
        return id_autor;
    }

    public void setId_autor(Long id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<LibroE> getLibros() {
        return libros;
    }

    public void setLibros(List<LibroE> libros) {
        this.libros = libros;
    }
}
