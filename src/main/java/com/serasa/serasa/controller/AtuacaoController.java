package com.serasa.serasa.controller;

import com.serasa.serasa.entity.Atuacao;
import com.serasa.serasa.entity.Vendedor;
import com.serasa.serasa.service.AtuacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/atuacao")
@CrossOrigin("*")
public class AtuacaoController {

    @Autowired
    private AtuacaoService atuacaoService;

    @PostMapping
    public ResponseEntity<Atuacao> saveVendedor(@RequestBody Atuacao atuacao) {
        atuacaoService.saveAtuacao(atuacao);
        return new ResponseEntity<Atuacao>(atuacao, HttpStatus.CREATED);
    }
}
