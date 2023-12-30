package com.example.EasyFood.controller.alimento.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AlterarAlimentoRequest {
    private String nome;
    private BigDecimal calorias;
    private BigDecimal carboidratos;
    private BigDecimal proteinas;
    private BigDecimal gorduras;
    private BigDecimal fibras;
    private BigDecimal sodio;
}
