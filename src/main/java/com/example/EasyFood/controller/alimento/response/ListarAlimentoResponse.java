package com.example.EasyFood.controller.alimento.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListarAlimentoResponse {
    private Long id;
    private String nome;
}
