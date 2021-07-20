package br.com.zupedu.dojo.ot4dojo.controllers;

import br.com.zupedu.dojo.ot4dojo.dto.request.TurmaRequest;
import br.com.zupedu.dojo.ot4dojo.entidades.Turma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.validation.Valid;

@RestController
public class TurmaController {

    @Autowired
    private EntityManager entityManager;

    @PostMapping("/cadastraturma")
    public void cadastraTurma(@RequestBody @Valid TurmaRequest turmaRequest) {
        Turma turma = turmaRequest.toModel(entityManager);


    }
}
