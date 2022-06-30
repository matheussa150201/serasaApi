package com.serasa.serasa.service;

import com.serasa.serasa.criteria.VendedorCB;
import com.serasa.serasa.entity.Atuacao;
import com.serasa.serasa.entity.Vendedor;
import com.serasa.serasa.exception.NotFoundException;
import com.serasa.serasa.repository.AtuacaoRepository;
import com.serasa.serasa.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private AtuacaoRepository atuacaoRepository;

    @Autowired
    private VendedorCB vendedorCB;

    public Vendedor saveVendedor(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public Vendedor findVendedorkById(Long id) {
        return vendedorRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Vendedor com o id: " + id + " não foi encontrado!"));
    }

    public void deleteVendedor(Long id) {
        vendedorRepository
                .findById(id)
                .map(vendedor -> {
                    vendedorRepository.delete(vendedor);
                    return Void.TYPE;
                })
                .orElseThrow(() -> new NotFoundException("Vendedor com o id: " + id + " não foi encontrado!"));
    }

    public List<Vendedor> fetchAllVendedor() {
        return vendedorCB.fetchAllVendedor();
    }

    public void updateVendedor (Long id, Vendedor vendedorAtualizado) {
        vendedorRepository
                .findById(id)
                .map( vendedorUpdate -> {
                    vendedorAtualizado.setId(vendedorUpdate.getId());
                    return vendedorRepository.save(vendedorAtualizado);
                })
                .orElseThrow(() -> new NotFoundException("Vendedor com o id: " + id + " não foi encontrado!"));
    }
}
