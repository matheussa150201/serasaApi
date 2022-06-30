package com.serasa.serasa.controller;

import com.serasa.serasa.entity.Vendedor;
import com.serasa.serasa.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vendedor")
@CrossOrigin("*")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @PostMapping
    public ResponseEntity<Vendedor> saveVendedor(@RequestBody Vendedor vendedor) {
        vendedorService.saveVendedor(vendedor);
        return new ResponseEntity<Vendedor>(vendedor, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Vendedor>> searchAllVendedor() {
        List<Vendedor> vendedor = vendedorService.fetchAllVendedor();
        return ResponseEntity.ok(vendedor);
    }

//    @GetMapping("/regiaoAtuacaoVendedor/{regiao}")
//    public ResponseEntity<List<Vendedor>> searchAllEstadosCorresponentesRegiao() {
//        List<Vendedor> vendedor = vendedorService.fetchAllRegiaoAtuacaoVendedor();
//        return ResponseEntity.ok(vendedor);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> findVendedorById(@PathVariable Long id) {
        Vendedor vendedor = vendedorService.findVendedorkById(id);
        return ResponseEntity.ok(vendedor);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateVendedor(@PathVariable Long id, @RequestBody Vendedor venededorAtualizado) {
        vendedorService.updateVendedor(id, venededorAtualizado);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        vendedorService.deleteVendedor(id);
    }
}
