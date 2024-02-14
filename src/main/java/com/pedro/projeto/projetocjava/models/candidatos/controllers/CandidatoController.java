package com.pedro.projeto.projetocjava.models.candidatos.controllers;

import com.pedro.projeto.projetocjava.models.candidatos.CandidatoEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @PostMapping("/")
    public void create(@RequestBody CandidatoEntity candidatoEntity) {
        System.out.println("Candidato: " + candidatoEntity.getEmail());
    }
}
