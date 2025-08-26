package com.example.sistema_financas_pessoal.service;

import com.example.sistema_financas_pessoal.entity.CentroCusto;
import com.example.sistema_financas_pessoal.repository.CentroCustoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CentroCustoService {
    private final CentroCustoRepository centroCustoRepository;

    public CentroCustoService(CentroCustoRepository centroCustoRepository) {
        this.centroCustoRepository = centroCustoRepository;
    }

    public List<CentroCusto> findAll() {
        return centroCustoRepository.findAll();
    }

    public Optional<CentroCusto> findById(Long id) {
        return centroCustoRepository.findById(id);
    }

    public CentroCusto save(CentroCusto centroCusto) {
        return centroCustoRepository.save(centroCusto);
    }

    public void delete(Long id) {
        centroCustoRepository.deleteById(id);
    }
}
