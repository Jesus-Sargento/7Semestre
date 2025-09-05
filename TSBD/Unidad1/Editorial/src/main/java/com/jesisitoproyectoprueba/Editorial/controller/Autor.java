package com.jesisitoproyectoprueba.Editorial.controller;

import com.jesisitoproyectoprueba.Editorial.entity.AutorE;
import com.jesisitoproyectoprueba.Editorial.repository.AutorR;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/autores")
public class Autor {
    private final AutorR autorRepository;

    public Autor(AutorR autorRepository) {
        this.autorRepository = autorRepository;
    }

    @GetMapping
    public List<AutorE> getAll() {
        return autorRepository.findAll();
    }

    @PostMapping
    public AutorE create(@RequestBody AutorE autor) {
        return autorRepository.save(autor);
    }



}
