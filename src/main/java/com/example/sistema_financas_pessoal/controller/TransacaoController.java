package com.example.sistema_financas_pessoal.controller;

import com.example.sistema_financas_pessoal.entity.Transacao;
import com.example.sistema_financas_pessoal.service.TransacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @GetMapping
    public List<Transacao> getAll() {
        return transacaoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Transacao> getById(@PathVariable Long id) {
        return transacaoService.findById(id);
    }

    @PostMapping
    public Transacao create(@RequestBody Transacao transacao) {
        return transacaoService.save(transacao);
    }

    @PutMapping("/{id}")
    public Transacao update(@PathVariable Long id, @RequestBody Transacao transacao) {
        transacao.setId(id);
        return transacaoService.save(transacao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        transacaoService.delete(id);
    }
}
