package com.serasa.serasa.service;

import com.serasa.serasa.entity.Atuacao;
import com.serasa.serasa.repository.AtuacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtuacaoService {

    @Autowired
    private AtuacaoRepository atuacaoRepository;

    public Atuacao saveAtuacao(Atuacao atuacao) {
        return atuacaoRepository.save(atuacao);
    }
}
