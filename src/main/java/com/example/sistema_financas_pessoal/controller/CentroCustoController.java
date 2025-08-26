package com.example.sistema_financas_pessoal.controller;

import com.example.sistema_financas_pessoal.entity.CentroCusto;
import com.example.sistema_financas_pessoal.service.CentroCustoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/centrocustos")
public class CentroCustoController {
    private final CentroCustoService centroCustoService;

    public CentroCustoController(CentroCustoService centroCustoService) {
        this.centroCustoService = centroCustoService;
    }

    @GetMapping
    public List<CentroCusto> getAll() {
        return centroCustoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CentroCusto> getById(@PathVariable Long id) {
        return centroCustoService.findById(id);
    }

    @PostMapping
    public CentroCusto create(@RequestBody CentroCusto centroCusto) {
        return centroCustoService.save(centroCusto);
    }

    @PutMapping("/{id}")
    public CentroCusto update(@PathVariable Long id, @RequestBody CentroCusto centroCusto) {
        centroCusto.setId(id);
        return centroCustoService.save(centroCusto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        centroCustoService.delete(id);
    }
}
