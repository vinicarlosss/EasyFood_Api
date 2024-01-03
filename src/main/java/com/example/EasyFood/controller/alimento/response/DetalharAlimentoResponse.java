package com.example.EasyFood.controller.alimento.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class DetalharAlimentoResponse {
    private Long id;
    private String nome;
    private BigDecimal calorias;
    private BigDecimal carboidratos;
    private BigDecimal proteinas;
    private BigDecimal gorduras;
    private BigDecimal fibras;
    private BigDecimal sodio;
}
