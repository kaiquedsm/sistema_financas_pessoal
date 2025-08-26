package com.example.sistema_financas_pessoal.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoDTO {
    private Long id;
    private String tipo; // RECEITA ou DESPESA
    private BigDecimal valor;
    private LocalDateTime data;
    private String descricao;
    private Long categoriaId;
    private Long contaId;

    // getters e setters
}
