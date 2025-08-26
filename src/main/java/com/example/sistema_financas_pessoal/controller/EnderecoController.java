package com.example.sistema_financas_pessoal.controller;

import com.example.sistema_financas_pessoal.entity.Endereco;
import com.example.sistema_financas_pessoal.service.EnderecoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping
    public List<Endereco> getAll() {
        return enderecoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Endereco> getById(@PathVariable Long id) {
        return enderecoService.findById(id);
    }

    @PostMapping
    public Endereco create(@RequestBody Endereco endereco) {
        return enderecoService.save(endereco);
    }

    @PutMapping("/{id}")
    public Endereco update(@PathVariable Long id, @RequestBody Endereco endereco) {
        endereco.setId(id);
        return enderecoService.save(endereco);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        enderecoService.delete(id);
    }
}
