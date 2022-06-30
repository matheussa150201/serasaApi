package com.serasa.serasa.repository;

import com.serasa.serasa.entity.Atuacao;
import com.serasa.serasa.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtuacaoRepository extends JpaRepository<Atuacao, Long> {
}
