package com.example.sistema_financas_pessoal.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "centro_custo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CentroCusto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    private String descricao;

}
