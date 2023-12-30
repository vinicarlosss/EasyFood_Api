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
    @NotBlank(message = "O campo nome não pode estar em branco.")
    @NotEmpty(message = "O campo nome nçao pode estar vazio.")
    private String nome;
    @NotNull
    private BigDecimal calorias;
    @NotNull
    private BigDecimal carboidratos;
    @NotNull
    private BigDecimal proteinas;
    @NotNull
    private BigDecimal gorduras;
    private BigDecimal fibras;
    private BigDecimal sodio;
}
