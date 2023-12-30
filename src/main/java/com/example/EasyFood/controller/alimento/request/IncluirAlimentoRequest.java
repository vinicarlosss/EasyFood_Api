package com.example.EasyFood.controller.alimento.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class IncluirAlimentoRequest {

    private String nome;
    private BigDecimal calorias;
    private BigDecimal carboidratos;
    private BigDecimal proteinas;
    private BigDecimal gorduras;
    private BigDecimal fibras;
    private BigDecimal sodio;
}
