package com.jesisitoproyectoprueba.Editorial.controller;

import com.jesisitoproyectoprueba.Editorial.entity.LibroE;
import com.jesisitoproyectoprueba.Editorial.repository.LibroR;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class Libro {

    private final LibroR libroRepository;

    public Libro(LibroR libroRepository) {
        this.libroRepository = libroRepository;
    }

    @GetMapping
    public List<LibroE> getAll() {
        return libroRepository.findAll();
    }

    @PostMapping
    public LibroE create(@RequestBody LibroE libro) {
        return libroRepository.save(libro);
    }
}
